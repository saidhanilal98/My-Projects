const express = require("express");
const router = express.Router();
const User = require("../models/user");
const bcrypt = require("bcrypt");
const jwt = require("jsonwebtoken");

router.post("/register", (req, res) => {
  bcrypt.hash(req.body.password, 10).then((hash) => {
    const user = new User({
      username: req.body.username,
      password: hash,
    });
    user
      .save()
      .then((result) => {
        res.status(201).json({
          message: "User has registered Successfully!",
          result: result,
        });
      })
      .catch((err) => {
        res.status(500).json({
          error: err,
        });
      });
  });
});

router.post("/login", (req, res) => {
  let fetchedUser;
  User.findOne({ username: req.body.username })
    .then((user) => {
      //missing code here ???????
      if (!user) {
        return res.status(401).json({
          message: "Auth failed",
        });
      }

      fetchedUser = user;

      return bcrypt.compare(req.body.password, user.password);
    })
    .then((result) => {
      console.log("result to password match: " + result);
      if (!result) {
        return res.status(401).json({
          message: "Authentication Unsuccessful",
        });
      }

      const token = jwt.sign(
        { username: fetchedUser.username, userid: fetchedUser._id },
        "secret_this_should_be_longer_than_it_is",
        { expiresIn: "1h" }
      );
      res.status(200).json({ token: token });
    })
    .catch((err) => {
      return res.status(401).json({
        message: "Authentication Unsuccessful",
      });
    });
});

module.exports = router;

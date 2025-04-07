const express = require("express");
const router = express.Router();
const Post = require("../models/post");
const checkauth = require("../check_auth");

router.get("", (req, res) => {
  Post.find()
    .then((posts) => {
      res.status(200).json({
        message: "Posts fetched successfully",
        posts: posts,
      });
    })
    .catch((err) => {
      res.status(500).json({
        error: err,
      });
    });
});

router.post("", checkauth, (req, res) => {
  const post = new Post({
    id: req.body.id,
    department: req.body.department,
    issue: req.body.issue,
  });

  post.save().then(() => {
    res.status(201).json({
      message: "Post Created Successfully",
      post: post,
    });
  });

  router.delete("/:id", checkauth, (req, res) => {
    const postId = req.params.id;

    Post.deleteOne({ _id: postId })
      .then((result) => {
        if (result.deletedCount === 0) {
          return res.status(404).json({
            message: "The deletion has failed due the post not being found.",
          });
        }

        res.status(200).json({ message: "Post Deleted Successfully!" });
      })
      .catch((err) => {
        res.status(500).json({ error: err });
      });
  });
});

module.exports = router;

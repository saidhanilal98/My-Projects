const express = require("express");
const Post = require("./models/post");
const app = express();
const urlprefix = "/api";
const mongoose = require("mongoose");
const Users = require("./models/post");
const fs = require("fs");
const cert = fs.readFileSync("keys/certificate.pem");
const options = {
  server: { sslCA: cert },
};
const connstring =
  "mongodb+srv://ST10090106:0XCyi2cOfzzNcCyN@backend.t8upocn.mongodb.net/?retryWrites=true&w=majority";

const postRoutes = require("./routes/post");
const userRoutes = require("./routes/user");

mongoose
  .connect(connstring)
  .then(() => {
    console.log("Successfully Connected!");
  })
  .catch(() => {
    console.log("Not Connected Successfully!");
  }, options);

app.use((req, res, next) => {
  res.setHeader("Access-Control-Allow-Origin", "*");
  res.setHeader(
    "Access-Control-Allow-Headers",
    "Origin, X-Requested-With, Content-Type, Accept, Authorization"
  );
  res.setHeader("Access-Control-Allow-Methods", "*");
  next();
});

app.use(express.json());

// app.get(urlprefix + "/posts", (req, res) => {
//   Post.find()
//     .then((posts) => {
//       res.status(200).json({
//         message: "Posts fetched successfully",
//         posts: posts,
//       });
//     })
//     .catch((err) => {
//       res.status(500).json({
//         error: err,
//       });
//     });
// });

// app.post(urlprefix + "/posts", (req, res) => {
//   const post = new Post({
//     id: req.body.id,
//     department: req.body.department,
//     issue: req.body.issue,
//   });
//   post.save();
//   res.status(201).json({
//     message: "Post created",
//     post: post,
//   });
// });

// app.delete(urlprefix + "/posts/:id", (req, res) => {
//   Users.deleteOne({ id: req.params.id }).then((result) => {
//     res.status(200).json({ message: "Post Successfully Deleted" });
//   });
// });

app.use(urlprefix + "/posts", postRoutes);
app.use(urlprefix + "/users", userRoutes);

module.exports = app;

const mongoose = require('mongoose')

const postschema = mongoose.Schema(
    {
        id:{type: String, required:true},
        department:{type: String, required:true},
        issue:{type: String, required:true}
    }
)

module.exports = mongoose.model('Post', postschema)
const mongoose = require('mongoose')

const userschema = mongoose.Schema(
    {
        username:{type: String, required:true},
        password:{type: String, reuired:true}
    }
)

module.exports = mongoose.model('User', userschema)
package com.mitchellehope.mypost

import android.icu.text.CaseMap
import android.provider.ContactsContract
import android.security.identity.AccessControlProfileId


data class Post(
    var  userId:Int,
    var id: Int,
    var title: String,
    var body: String,

)
data class  Comment(
    var postId:Int,
    var Id:Int,
    var name:String,
    var email:String,
    var body:String,
)





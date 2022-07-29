package com.mitchellehope.mypost

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/posts")
    fun getpost(): Call<List<Post>>

}
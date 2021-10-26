package com.example.gametrics

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @GET("/api/users/users")
    fun list(): Call<List<User>>
}

class User() {
    @SerializedName("id")
    private val id:String?=null

    @SerializedName("user")
    private val user:String?=null

    @SerializedName("password")
    private val password:String?=null

    @SerializedName("email")
    private val email:String?=null

    override fun toString(): String {
        return "$id $user $password $email"
    }
}

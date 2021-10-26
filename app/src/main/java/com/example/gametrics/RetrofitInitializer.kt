package com.example.gametrics

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    private val url = "http://10.0.0.103:8080/"

    private val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    fun userService(): UserService = retrofit.create(UserService::class.java)
}
package com.example.myapplication
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import com.google.gson.Gson
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    var client :OkHttpClient = OkHttpClient.Builder().build()
    var retrofit :Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl : "https://courses-service.herokuapp.com/").addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    fun <T> buildService(service: Class<T>): T{
            return retrofit.create(service)
    }
}


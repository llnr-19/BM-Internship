package com.example.mentortasks.news

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/everything")
    fun getEverything(@Query("q")query:String,@Query("apiKey")apiKey:String): Call<Everything>
}
var client=OkHttpClient().newBuilder().addInterceptor(HttpLoggingInterceptor().setLevel(
    HttpLoggingInterceptor.Level.BODY
))
    .build()
var retrofit =Retrofit.Builder()
    .baseUrl("https://newsapi.org/")
    .client(client)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
var service:NewsApi= retrofit.create(NewsApi::class.java)
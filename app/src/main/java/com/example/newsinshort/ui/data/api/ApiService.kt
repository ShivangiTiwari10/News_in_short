package com.example.newsinshort.ui.data.api

import com.example.newsinshort.ui.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    fun getNewsHeadline(

        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "Your_API_key"

    ): Response<NewsResponse>
}


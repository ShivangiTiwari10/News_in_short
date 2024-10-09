package com.example.newsinshort.ui.data.datasource

import com.example.newsinshort.ui.data.entity.NewsResponse
import retrofit2.Response


interface NewsDataSource {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}
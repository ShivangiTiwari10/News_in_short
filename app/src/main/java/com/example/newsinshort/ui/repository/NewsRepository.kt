package com.example.newsinshort.ui.repository

import com.example.newsinshort.ui.data.datasource.NewsDataSource
import com.example.newsinshort.ui.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {

    suspend fun getNewsHeadline(country: String): Response<NewsResponse> {

        return newsDataSource.getNewsHeadline(country)
    }

}
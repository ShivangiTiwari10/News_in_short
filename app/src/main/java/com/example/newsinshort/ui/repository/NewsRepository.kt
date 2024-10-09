package com.example.newsinshort.ui.repository

import com.example.newsinshort.ui.data.datasource.NewsDataSource
import com.example.newsinshort.ui.data.entity.NewsResponse
import com.example.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import java.lang.Error
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {

//    suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
//
//        return newsDataSource.getNewsHeadline(country)
//    }

    suspend fun getNewsHeadline(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadline(country)

            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {

                error(Error("Error Fetching News Data"))
            }
        }
            .catch { e ->
                emit(ResourceState.Error(e?.localizedMessage ?: "Some error in flow"))
            }
    }

}
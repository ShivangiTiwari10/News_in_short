package com.example.newsinshort.ui.data.di

import com.example.newsinshort.ui.data.AppConstants
import com.example.newsinshort.ui.data.api.ApiService
import com.example.newsinshort.ui.data.datasource.NewsDataSource
import com.example.newsinshort.ui.data.datasource.NewsDataSourceImpl
import com.example.newsinshort.ui.repository.NewsRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


// MODULE for Dagger Hilt where  all the dependencies related code is present
@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {


        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {

            level = HttpLoggingInterceptor.Level.BASIC
        }


        val httpClient = OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
        }

        httpClient.apply {
            readTimeout(60, TimeUnit.SECONDS)
        }

        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        return Retrofit.Builder()
            .baseUrl(AppConstants.APP_BASE_URL)
            .client(httpClient.build())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    @Provides
    @Singleton
    fun providesApiServices(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }


    @Provides
    @Singleton
    fun providesNewsDataSource(apiService: ApiService): NewsDataSource {
        return NewsDataSourceImpl(apiService)

    }


    @Provides
    @Singleton
    fun providesNewsRepository(newsDataSource: NewsDataSource): NewsRepository {
        return NewsRepository(newsDataSource)
    }


}
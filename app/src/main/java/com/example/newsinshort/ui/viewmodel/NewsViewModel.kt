package com.example.newsinshort.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsinshort.ui.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository

) : ViewModel() {

    suspend fun getNews(country: String) {

        viewModelScope.launch(Dispatchers.IO) {
            newsRepository.getNewsHeadline(country)
        }
    }


    init {
        Log.d(TAG, "init block of newsViewModel")

    }


    companion object {
        const val TAG = "NewsViewModel"
    }
}
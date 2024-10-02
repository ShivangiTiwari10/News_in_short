package com.example.newsinshort.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.newsinshort.ui.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository

) : ViewModel() {
    init {
        Log.d(TAG, "init block of newsViewModel")

    }


    companion object {
        const val TAG = "NewsViewModel"
    }
}
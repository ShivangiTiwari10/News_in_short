package com.example.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsinshort.ui.components.EmptyStateComponent
import com.example.newsinshort.ui.components.Loader
import com.example.newsinshort.ui.components.NewsRowComponent
import com.example.newsinshort.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState

const val TAG = "HomeScreen"


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()

) {
    val newsResponse by newsViewModel.news.collectAsState()

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green)
    ) {

        val pagerState = rememberPagerState(initialPage = 0, initialPageOffsetFraction = 0f) {
            100
        }
        VerticalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
            pageSize = PageSize.Fill,
            pageSpacing = 8.dp
        ) { page: Int ->
            when (newsResponse) {
                is ResourceState.Loading -> {
                    Log.d(TAG, "Inside Loading")
                    Loader()
                }

                is ResourceState.Success -> {

                    val response = (newsResponse as ResourceState.Success).data
                    Log.d(TAG, "Inside Success ${response.totalResults} = ${response.status}")
                    if (response.articles.isNotEmpty()) {
                        NewsRowComponent(page, response.articles[page])

                    } else {
                        EmptyStateComponent()
                    }
                }

                is ResourceState.Error -> {
                    val error = (newsResponse as ResourceState.Error).error

                    Log.d(TAG, "Inside error $error")
                }
            }
        }


    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen()
}
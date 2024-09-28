package com.example.newsinshort.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {


    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Green)) {

    }
}

@Preview
@Composable
fun HomePreview() {
    HomeScreen()
}
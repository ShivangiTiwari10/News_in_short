package com.example.utilities

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

object CoreUtility {

    fun isInternetConnected(context: Context): Boolean {

        val conectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val networkCapabilities = conectivityManager.activeNetwork ?: return false

        val actNw = conectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

        val result = when {

            actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
        }

        return result

    }
}
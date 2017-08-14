package com.costular.kotlin_utils.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.costular.kotlin_utils.manager.getConnectivityManager

/**
 * Created by costular on 14/08/17.
 */
fun Context.isNetworkAvailable(): Boolean {
    val state = getConnectivityManager().activeNetworkInfo.state
    return (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)
}

fun Context.getNetworkType(): Int = getConnectivityManager().activeNetworkInfo.type

fun Context.getNetworkTypeAsString(): String {
    when(getConnectivityManager().activeNetworkInfo.type) {
        ConnectivityManager.TYPE_WIFI -> return "WiFi"
        ConnectivityManager.TYPE_MOBILE -> return "Mobile"
        else -> return ""
    }
}
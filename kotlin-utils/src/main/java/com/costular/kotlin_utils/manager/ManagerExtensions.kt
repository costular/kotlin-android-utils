package com.costular.kotlin_utils.manager

import android.content.ClipboardManager
import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by costular on 14/08/17.
 */
fun Context.getClipboardManager() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

fun Context.getConnectivityManager() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
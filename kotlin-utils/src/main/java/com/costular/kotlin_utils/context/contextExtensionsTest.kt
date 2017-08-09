package com.costular.kotlin_utils.context

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.preference.PreferenceManager
import android.support.annotation.UiThread

/**
 * Created by costular on 01/08/17.
 */
fun Context.getClipboardManager() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

fun Context.copyTextToClipboard(value: String) {
    getClipboardManager().primaryClip = ClipData.newPlainText("text", value)
}

fun Context.copyUriToClipboard(uri: Uri) {
    getClipboardManager().primaryClip = ClipData.newUri(contentResolver, "uri", uri)
}

fun Context.getTextFromClipboard(): CharSequence {
    val clipData = getClipboardManager().primaryClip
    if (clipData != null && clipData.itemCount > 0) {
        return clipData.getItemAt(0).coerceToText(this)
    }

    return ""
}

fun Context.getUriFromClipboard(): Uri? {
    val clipData = getClipboardManager().primaryClip
    if (clipData != null && clipData.itemCount > 0) {
        return clipData.getItemAt(0).uri
    }

    return null
}

fun Context.getPreferences(): SharedPreferences {
    return PreferenceManager.getDefaultSharedPreferences(this)
}

fun Context.getPreferences(name: String, mode: Int = Context.MODE_PRIVATE): SharedPreferences {
    return getSharedPreferences(name, mode)
}


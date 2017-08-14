package com.costular.kotlin_utils.clipboard

import android.content.ClipData
import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.preference.PreferenceManager
import com.costular.kotlin_utils.manager.getClipboardManager

/**
 * Created by costular on 14/08/17.
 */

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


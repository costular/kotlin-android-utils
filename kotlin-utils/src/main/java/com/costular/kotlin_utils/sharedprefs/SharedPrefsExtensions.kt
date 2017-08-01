package com.costular.kotlin_utils.sharedprefs

import android.content.SharedPreferences

/**
 * Created by costular on 01/08/17.
 */
inline fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.func()
    editor.apply()
}
package com.costular.kotlin_utils.activity

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager

/**
 * Created by costular on 01/08/17.
 */
fun Activity.setFullScreen() {
    window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN)
}

fun Activity.showToolbar() {
    actionBar?.show()
}

fun Activity.hideToolbar() {
    actionBar?.hide()
}

fun AppCompatActivity.showToolbar() {
    supportActionBar?.show()
}

fun AppCompatActivity.hideToolbar() {
    supportActionBar?.hide()
}



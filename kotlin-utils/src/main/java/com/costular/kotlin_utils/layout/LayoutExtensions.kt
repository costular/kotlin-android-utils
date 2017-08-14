package com.costular.kotlin_utils.layout

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by costular on 15/08/17.
 */

fun Context.inflate(layoutResource: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false) {
    LayoutInflater.from(this).inflate(layoutResource, parent, attachToRoot)
}
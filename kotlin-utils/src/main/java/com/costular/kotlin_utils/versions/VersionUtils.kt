package com.costular.kotlin_utils.versions

import android.os.Build

/**
 * Created by costular on 01/08/17.
 */
class VersionUtils {

    companion object {

        inline fun doWithVersion(version: Int, body: () -> Unit) {
            if (Build.VERSION.SDK_INT == version) {
                body()
            }
        }

        inline fun doWithAtLeastVersion(version: Int, body: () -> Unit) {
            if (Build.VERSION.SDK_INT >= version) {
                body()
            }
        }

        inline fun doWithHigherVersion(version: Int, body: () -> Unit) {
            if (Build.VERSION.SDK_INT > version) {
                body()
            }
        }

        inline fun doWithLowerVersion(version: Int, body: () -> Unit) {
            if (Build.VERSION.SDK_INT < version) {
                body()
            }
        }

    }

}
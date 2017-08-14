package com.costular.kotlin_utils.versions

import android.os.Build.VERSION_CODES.KITKAT
import android.os.Build.VERSION_CODES.LOLLIPOP
import com.costular.kotlin_utils.BuildConfig
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Created by costular on 14/08/17.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(KITKAT, LOLLIPOP))
class VersionsTest {

    @Config(sdk = intArrayOf(LOLLIPOP))
    @Test(expected = InvalidVersionException::class)
    fun testCodeLowerVersion_shouldFailWithHigherVersion() {
        VersionUtils.doWithLowerVersion(KITKAT) {
            // This should fail
        }
    }

    @Config(sdk = intArrayOf(LOLLIPOP))
    @Test
    fun testCodeAtLeastVersion_shouldPassWithHigherVersion() {
        VersionUtils.doWithAtLeastVersion(KITKAT) {
            // This should pass
        }
    }

    @Config(sdk = intArrayOf(KITKAT))
    @Test(expected = InvalidVersionException::class)
    fun testCodeAtLeastVersion_shouldFailWithMinorVersion() {
        VersionUtils.doWithAtLeastVersion(LOLLIPOP) {
            // This should fail
        }
    }

    @Config(sdk = intArrayOf(LOLLIPOP))
    @Test
    fun testCodeEqualVersion_shouldPassWithLollipop() {
        VersionUtils.doWithAtLeastVersion(LOLLIPOP) {
            // This should pass
        }
    }

    @Config(sdk = intArrayOf(KITKAT))
    @Test(expected = InvalidVersionException::class)
    fun testCodeAtLeastVersion_shouldFailWithLowerVersion() {
        VersionUtils.doWithAtLeastVersion(LOLLIPOP) {
            // This should fail
        }
    }

    @Config(sdk = intArrayOf(KITKAT))
    @Test(expected = InvalidVersionException::class)
    fun testCodeHigherVersion_shouldFailWithMinorVersion() {
        VersionUtils.doWithHigherVersion(LOLLIPOP) {
            // This should fail
        }
    }

    @Config(sdk = intArrayOf(LOLLIPOP))
    @Test
    fun testCodeHigherVersion_shouldPassWithMinorVersion() {
        VersionUtils.doWithAtLeastVersion(KITKAT) {
            // This should pass
        }
    }
}
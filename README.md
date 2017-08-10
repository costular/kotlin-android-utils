![Logo](https://raw.githubusercontent.com/costular/android-kotlin-utils/master/files/img/logo.png)

[![Build Status](https://travis-ci.org/costular/kotlin-android-utils.svg?branch=master)](https://travis-ci.org/costular/kotlin-android-utils)
[ ![Download](https://api.bintray.com/packages/costular/maven/kotlin-android-utils/images/download.svg) ](https://bintray.com/costular/maven/kotlin-android-utils/_latestVersion)
[![license](https://camo.githubusercontent.com/8f54547853cfad57acfc8e06e6008cc296cda34d/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6c6963656e73652d417061636865253230322d626c75652e737667)](https://github.com/costular/android-kotlin-utils/blob/master/LICENSE)

Android utilities for easier and faster **Kotlin** programming.

## Download

#### Gradle
``` groovy
compile 'com.costular:kotlin-utils:0.1'
```

## How to use

It depends on utilities. Some of them just work as function extensions and you don't have to do anything special, just call a method like another one.

## API 

### Activity

``` kotlin
setFullScreen()
showToolbar() // Support and native
hideToolbar() // Support and native
```

### Context

``` kotlin
getClipboardManager()
copyTextToClipboard(value: String)
copyUriToClipboard(uri: Uri)
getTextFromClipboard(): CharSequence
getUriFromClipboard(): Uri?
getPreferences(): SharedPreferences
getPreferences(name: String, mode: Int): SharedPreferences
```

### SharedPreferences

#### SharedPreferences.use(lambda)
It automatically applies after lambda execution
``` kotlin
val sharedPrefs = context.getPreferences()
sharedPrefs.edit {
    putBoolean("first_use", false) // This refers to sharedPrefs instance
}
```

### Versions

These methods are static.

``` kotlin 
doWithVersion(version: Int, lambda) // ==
doWithAtLeastVersion(version: Int, lambda) // >=
doWithHigherVersion(version: Int, lambda) // >
doWithLowerVersion(version: Int, lambda) // <
```

Example

``` kotlin
doWithAtLeastVersion(21) {
    // Do something on Lollipop version or higher
}
```
package com.airlift.productapp.utils

import android.content.Context
import android.content.SharedPreferences

class Prefs (context: Context)
{

    private val preferences: SharedPreferences = context.getSharedPreferences("MY_APP_PREFERENCES", Context.MODE_PRIVATE)


    private val APP_PREF_USER_PHONE: String = "APP_PREF_USER_PHONE"
    var userPhonePrefs: String?
        get() = preferences.getString(APP_PREF_USER_PHONE, "")
        set(value) = preferences.edit().putString(APP_PREF_USER_PHONE, value).apply()

    private val APP_PREF_USER_NAME: String = "APP_PREF_USER_NAME"
    var userNamePrefs: String?
        get() = preferences.getString(APP_PREF_USER_NAME, "")
        set(value) = preferences.edit().putString(APP_PREF_USER_NAME, value).apply()

    private val APP_PREF_USER_AUTHORITY: String = "APP_PREF_USER_AUTHORITY"
    var userAuthorityPrefs: String?
        get() = preferences.getString(APP_PREF_USER_AUTHORITY, "")
        set(value) = preferences.edit().putString(APP_PREF_USER_AUTHORITY, value).apply()

    private val isLoggedInPrefs: String = "IS_LOGGED_IN"
    var IS_LOGGED_IN: Boolean?
        get() = preferences.getBoolean(isLoggedInPrefs, false)
        set(value) = preferences.edit().putBoolean(isLoggedInPrefs, value!!).apply()


}
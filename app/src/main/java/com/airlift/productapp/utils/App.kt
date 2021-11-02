package com.airlift.productapp.utils

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.os.Build


val prefs: Prefs by lazy {
    App.prefs!!
}

class App: Application()
{
    companion object {
        var prefs: Prefs? = null
        lateinit var instance: App

        var appContext: Context? = null
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
        appContext = applicationContext
        prefs = Prefs(applicationContext)




    }


}
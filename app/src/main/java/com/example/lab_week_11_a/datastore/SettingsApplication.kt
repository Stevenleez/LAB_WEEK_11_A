package com.example.lab_week_11_a.datastore

import android.app.Application

class SettingsApplication : Application() {
    lateinit var settingsStore: SettingsStore
    override fun onCreate() {
        super.onCreate()

        settingsStore = SettingsStore(this)
    }
}
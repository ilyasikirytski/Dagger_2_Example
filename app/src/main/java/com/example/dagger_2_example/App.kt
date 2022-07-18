package com.example.dagger_2_example

import android.app.Application

class App : Application() {
    val appComponent = DaggerAppComponent.create()
}
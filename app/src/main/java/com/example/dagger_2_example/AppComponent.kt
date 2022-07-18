package com.example.dagger_2_example

import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
    fun getDatabaseHelper(): DatabaseHelper
    fun getNetworkUtils(): NetworkUtils
    fun injectMainActivity(mainActivity: MainActivity)
}

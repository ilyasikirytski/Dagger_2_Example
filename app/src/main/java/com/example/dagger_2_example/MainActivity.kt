package com.example.dagger_2_example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        get-methods
        val appComponent = (application as App).appComponent
        Log.i("MSG", appComponent.getDatabaseHelper().toString())
        Log.i("MSG", appComponent.getNetworkUtils().toString())

//        inject-method
        (application as App).appComponent.injectMainActivity(this)
        Log.i("MSG", databaseHelper.toString())
        Log.i("MSG", networkUtils.toString())
    }
}
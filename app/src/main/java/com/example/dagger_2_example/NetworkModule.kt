package com.example.dagger_2_example

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }
}
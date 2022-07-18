package com.example.dagger_2_example

import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }
}
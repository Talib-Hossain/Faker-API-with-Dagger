package com.example.fakerapiwithdagger

import android.app.Application
import com.example.fakerapiwithdagger.di.ApplicationComponent
import com.example.fakerapiwithdagger.di.DaggerApplicationComponent
import dagger.Component

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

        applicationComponent= DaggerApplicationComponent.builder().build()
    }
}
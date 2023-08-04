package com.example.fakerapiwithdagger.di

import com.example.fakerapiwithdagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}
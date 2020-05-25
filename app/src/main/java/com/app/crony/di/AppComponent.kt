package com.app.crony.di

import android.app.Application
import com.app.crony.LoginActivity
import com.app.crony.RegisterActivity
import com.app.crony.SplashActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, ContextModule::class])
interface AppComponent {

    fun inject(activity: LoginActivity)
    fun inject(activity: RegisterActivity)
    fun inject(activity: SplashActivity)

}
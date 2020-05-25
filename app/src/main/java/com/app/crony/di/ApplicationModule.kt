package com.app.crony.di

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.app.crony.DashboardActivity
import com.app.crony.LoginActivity
import com.app.crony.RegisterActivity
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class ApplicationModule {

    @Singleton
    @Named("GotoLogin")
    @Provides
    fun provideSplashIntent(appCompatActivity: AppCompatActivity): Intent {
        return Intent(appCompatActivity, LoginActivity::class.java)
    }

    @Singleton
    @Named("GotoDashboard")
    @Provides
    fun provideLoginIntent(appCompatActivity: AppCompatActivity): Intent {
        return Intent(appCompatActivity, DashboardActivity::class.java)
    }

    @Singleton
    @Named("GotoRegister")
    @Provides
    fun provideRegisterIntent(appCompatActivity: AppCompatActivity): Intent {
        return Intent(appCompatActivity, RegisterActivity::class.java)
    }

    @Singleton
    @Provides
    fun provideTimer(): Timer {
        return Timer()
    }


}
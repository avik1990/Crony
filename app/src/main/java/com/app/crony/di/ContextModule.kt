package com.app.crony.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
public abstract class ContextModule {
    @Binds
    abstract fun provideContext(application: Application?): Context?
}
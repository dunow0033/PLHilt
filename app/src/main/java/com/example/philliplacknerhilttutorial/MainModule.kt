package com.example.philliplacknerhilttutorial

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("String2")
    fun provideTestString1(
        @ApplicationContext context: Context,
        @Named("String") testString1: String
    ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}
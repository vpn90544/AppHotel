package com.apphotel.core.di.providers

import com.apphotel.core.di.qualifiers.DefaultNetworkApi
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.coroutines.CoroutineContext

interface NetworkProvider {

//    @DefaultNetworkApi
//    fun provideBaseUrl(): HttpUrl


    @DefaultNetworkApi
    fun provideRetrofit(): Retrofit


    @DefaultNetworkApi
    fun provideGson(): Gson

    @DefaultNetworkApi
    fun provideGsonConverterFactory(): GsonConverterFactory

    @DefaultNetworkApi
    fun provideCoroutineContext(): CoroutineContext
}
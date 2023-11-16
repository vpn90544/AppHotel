package com.apphotel.core

import com.apphotel.core.di.providers.ApplicationProvider

interface BaseApp {

    fun getApplicationProvider(): ApplicationProvider
}
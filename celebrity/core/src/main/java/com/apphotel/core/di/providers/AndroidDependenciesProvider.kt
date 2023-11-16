package com.apphotel.core.di.providers

import android.app.Application
import com.apphotel.core.di.qualifiers.ApplicationContext

interface AndroidDependenciesProvider {

    @ApplicationContext
    fun provideApplicationContext(): Application
}
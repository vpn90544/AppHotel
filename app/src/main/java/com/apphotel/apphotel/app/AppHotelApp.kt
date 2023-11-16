package com.apphotel.apphotel.app

import android.app.Application
import com.apphotel.apphotel.di.AppComponent
import com.apphotel.core.BaseApp
import com.apphotel.core.di.providers.ApplicationProvider


class AppHotelApp:Application(), BaseApp {

    private var appComponent: AppComponent? = null

    override fun onCreate() {
        appComponent = AppComponent.init(this).also { localAppComponent ->
            localAppComponent.inject(this)
            appComponent = localAppComponent
        }
        super.onCreate()
    }

    override fun getApplicationProvider(): ApplicationProvider {
        return appComponent ?: run {
            AppComponent.init(this).also { localAppComponent ->
                localAppComponent.inject(this)
                appComponent = localAppComponent
            }
        }

    }
}
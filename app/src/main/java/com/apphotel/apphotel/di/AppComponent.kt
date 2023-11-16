package com.apphotel.apphotel.di

import android.app.Application
import com.apphotel.apphotel.app.AppHotelApp
import com.apphotel.apphotel.di.modules.MediatorsModule
import com.apphotel.arch.di.ViewModelFactoryModule
import com.apphotel.core.di.AndroidDependenciesComponent
import com.apphotel.core.di.providers.AndroidDependenciesProvider
import com.apphotel.core.di.providers.ApplicationProvider
import com.apphotel.entry_point.di.modules.MainFragmentContainerModule
import com.apphotel.mainscreen.di.modules.ContentFragmentContainerModule
import com.apphotel.network.di.modules.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ AndroidDependenciesProvider::class ],
    modules = [
        NetworkModule::class,
        MediatorsModule::class,
        ViewModelFactoryModule::class,
        MainFragmentContainerModule::class,
        ContentFragmentContainerModule::class
    ]
)
interface AppComponent : ApplicationProvider {

    companion object {

        fun init(app: Application): AppComponent {
            val androidDependenciesComponent = AndroidDependenciesComponent.init(app)
            return DaggerAppComponent.builder()
                .androidDependenciesProvider(androidDependenciesComponent)
                .build()
        }
    }

    fun inject(app: AppHotelApp)
}
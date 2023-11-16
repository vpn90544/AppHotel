package com.apphotel.mainscreen.di

import com.apphotel.all_image_screen_api.modules.AllImageScreenModule
import com.apphotel.core.di.providers.ApplicationProvider
import com.apphotel.core.di.scopes.FeatureScope
import com.apphotel.like_image_screen_api.modules.LikeImageScreenModule
import com.apphotel.mainscreen.di.modules.MainScreenViewModelModule
import com.apphotel.mainscreen.presentation.MainScreenFragment
import dagger.Component

@FeatureScope
@Component(
    dependencies = [
        ApplicationProvider::class,
    ],
    modules = [
        MainScreenViewModelModule::class,
        AllImageScreenModule::class,
        LikeImageScreenModule::class
    ]
)
interface MainScreenComponent {

    companion object {

        fun init(applicationProvider: ApplicationProvider): MainScreenComponent {
            println("комапнент МАЙН фраг создан")
            return DaggerMainScreenComponent.builder()
                .applicationProvider(applicationProvider)
                .build()
        }
    }

    fun inject(fragment: MainScreenFragment)
}
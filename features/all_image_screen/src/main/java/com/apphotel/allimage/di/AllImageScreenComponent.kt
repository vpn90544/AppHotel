package com.apphotel.allimage.di

import com.apphotel.allimage.di.modules.AllImageRepositoryModule
import com.apphotel.allimage.di.modules.AllImageScreenViewModelModule
import com.apphotel.allimage.presentation.AllImageScreenFragment
import com.apphotel.core.di.providers.ApplicationProvider
import com.apphotel.core.di.scopes.FeatureScope
import dagger.Component

@FeatureScope
@Component(
    dependencies = [
        ApplicationProvider::class,
    ],
    modules = [
        AllImageScreenViewModelModule::class,
        AllImageRepositoryModule::class
    ]
)
interface AllImageScreenComponent {

    companion object {

        fun init(applicationProvider: ApplicationProvider): AllImageScreenComponent {
            println("комапнент МАЙН фраг создан")
            return DaggerAllImageScreenComponent.builder()
                .applicationProvider(applicationProvider)
                .build()
        }
    }

    fun inject(fragment: AllImageScreenFragment)
}
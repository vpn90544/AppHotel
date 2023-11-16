package com.apphotel.likeimage.di

import com.apphotel.core.di.providers.ApplicationProvider
import com.apphotel.core.di.scopes.FeatureScope
import com.apphotel.likeimage.di.modules.LikeImageScreenViewModelModule
import com.apphotel.likeimage.presentation.LikeImageScreenFragment
import dagger.Component

@FeatureScope
@Component(
    dependencies = [
        ApplicationProvider::class,
    ],
    modules = [
        LikeImageScreenViewModelModule::class
    ]
)
interface LikeImageScreenComponent {

    companion object {

        fun init(applicationProvider: ApplicationProvider): LikeImageScreenComponent {
            println("комапнент МАЙН фраг создан")
            return DaggerLikeImageScreenComponent.builder()
                .applicationProvider(applicationProvider)
                .build()
        }
    }

    fun inject(fragment: LikeImageScreenFragment)
}
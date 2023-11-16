package com.apphotel.allimage.di.modules

import com.apphotel.allimage.data.api.AllImagesService
import com.apphotel.core.di.qualifiers.DefaultNetworkApi
import com.apphotel.core.di.scopes.FeatureScope
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
interface AllImageRepositoryModule {

    companion object{

        @Provides
        @FeatureScope
        fun provideServiceLoginService(@DefaultNetworkApi retrofit: Retrofit): AllImagesService {
            return retrofit.create(AllImagesService::class.java)
        }
    }
}
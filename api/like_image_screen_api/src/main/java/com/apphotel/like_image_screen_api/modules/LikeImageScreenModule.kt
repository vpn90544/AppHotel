package com.apphotel.like_image_screen_api.modules

import com.apphotel.core.di.mediators.MediatorsMap
import com.apphotel.core.di.mediators.getMediator
import com.apphotel.core.di.qualifiers.MediatorsQualifier
import com.apphotel.like_image_screen_api.mediators.LikeImageScreenMediator
import dagger.Module
import dagger.Provides

@Module
object LikeImageScreenModule {

    @Provides
    fun provideMainScreenMediator(
        @MediatorsQualifier mediatorsMap: MediatorsMap
    ): LikeImageScreenMediator {
        return mediatorsMap.getMediator()
    }
}
package com.apphotel.all_image_screen_api.modules

import com.apphotel.all_image_screen_api.mediators.AllImageScreenMediator
import com.apphotel.core.di.mediators.MediatorsMap
import com.apphotel.core.di.mediators.getMediator
import com.apphotel.core.di.qualifiers.MediatorsQualifier
import dagger.Module
import dagger.Provides

@Module
object AllImageScreenModule {

    @Provides
    fun provideMainScreenMediator(
        @MediatorsQualifier mediatorsMap: MediatorsMap
    ): AllImageScreenMediator {
        return mediatorsMap.getMediator()
    }
}
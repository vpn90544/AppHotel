package com.apphotel.mainscreen_api.modules

import com.apphotel.core.di.mediators.MediatorsMap
import com.apphotel.core.di.mediators.getMediator
import com.apphotel.core.di.qualifiers.MediatorsQualifier
import dagger.Module
import dagger.Provides
import com.apphotel.mainscreen_api.mediators.MainScreenMediator

@Module
object MainScreenModule {

    @Provides
    fun provideMainScreenMediator(
        @MediatorsQualifier mediatorsMap: MediatorsMap
    ): MainScreenMediator {
        return mediatorsMap.getMediator()
    }
}
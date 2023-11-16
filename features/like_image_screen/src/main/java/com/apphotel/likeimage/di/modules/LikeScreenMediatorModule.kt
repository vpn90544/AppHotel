package com.apphotel.likeimage.di.modules

import com.apphotel.core.di.qualifiers.MediatorsQualifier
import com.apphotel.like_image_screen_api.mediators.LikeImageScreenMediator
import com.apphotel.likeimage.mediators.LikeImageScreenMediatorImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface LikeScreenMediatorModule {

    @[Binds IntoMap]
    @MediatorsQualifier
    @ClassKey(LikeImageScreenMediator::class)
    fun bindLikeImageScreenMediator(impl: LikeImageScreenMediatorImpl): Any
}
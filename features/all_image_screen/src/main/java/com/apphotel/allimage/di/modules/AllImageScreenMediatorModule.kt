package com.apphotel.allimage.di.modules

import com.apphotel.all_image_screen_api.mediators.AllImageScreenMediator
import com.apphotel.allimage.mediators.AllImageScreenMediatorImpl
import com.apphotel.core.di.qualifiers.MediatorsQualifier
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface AllImageScreenMediatorModule {

    @[Binds IntoMap]
    @MediatorsQualifier
    @ClassKey(AllImageScreenMediator::class)
    fun bindAllImageScreenMediator(impl: AllImageScreenMediatorImpl): Any
}
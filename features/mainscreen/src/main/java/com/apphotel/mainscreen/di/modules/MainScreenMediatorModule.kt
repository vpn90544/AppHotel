package com.apphotel.mainscreen.di.modules

import com.apphotel.core.di.qualifiers.MediatorsQualifier
import com.apphotel.mainscreen.mediators.MainScreenMediatorImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import com.apphotel.mainscreen_api.mediators.MainScreenMediator

@Module
interface MainScreenMediatorModule {

    @[Binds IntoMap]
    @MediatorsQualifier
    @ClassKey(MainScreenMediator::class)
    fun bindMainScreenMediator(impl: MainScreenMediatorImpl): Any
}
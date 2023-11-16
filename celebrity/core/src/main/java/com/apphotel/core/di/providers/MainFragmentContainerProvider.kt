package com.apphotel.core.di.providers

import com.apphotel.core.di.qualifiers.MainFragmentContainer


interface MainFragmentContainerProvider {

    @MainFragmentContainer
    fun provideMainFragmentContainer(): Int
}
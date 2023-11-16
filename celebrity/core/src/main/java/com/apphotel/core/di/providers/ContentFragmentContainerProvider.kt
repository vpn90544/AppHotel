package com.apphotel.core.di.providers

import com.apphotel.core.di.qualifiers.ContentFragmentContainer

interface ContentFragmentContainerProvider {

    @ContentFragmentContainer
    fun provideContentFragmentContainer(): Int
}
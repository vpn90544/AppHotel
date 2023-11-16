package com.apphotel.mainscreen.di.modules

import com.apphotel.core.di.qualifiers.ContentFragmentContainer
import com.apphotel.mainscreen.R
import dagger.Module
import dagger.Provides

@Module
object ContentFragmentContainerModule {

    @Provides
    @ContentFragmentContainer
    fun provideContentFragmentContainer(): Int {
        return R.id.fragment_container
    }
}
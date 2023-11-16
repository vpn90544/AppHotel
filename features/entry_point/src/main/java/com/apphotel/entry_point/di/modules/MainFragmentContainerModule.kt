package com.apphotel.entry_point.di.modules

import com.apphotel.core.di.qualifiers.MainFragmentContainer
import com.apphotel.entry_point.R
import dagger.Module
import dagger.Provides

@Module
object MainFragmentContainerModule {

    @Provides
    @MainFragmentContainer
    fun provideMainFragmentContainer(): Int {
        return R.id.main_fragment_container
    }
}
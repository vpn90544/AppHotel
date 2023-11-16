package com.apphotel.mainscreen.di.modules

import androidx.lifecycle.ViewModel
import com.apphotel.arch.di.ViewModelKey
import com.apphotel.mainscreen.presentation.MainScreenViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainScreenViewModelModule {

    @[Binds IntoMap]
    @ViewModelKey(MainScreenViewModel::class)
    fun bindMainViewModel(viewModel: MainScreenViewModel): ViewModel
}
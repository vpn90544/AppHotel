package com.apphotel.allimage.di.modules

import androidx.lifecycle.ViewModel
import com.apphotel.allimage.presentation.AllImageScreenViewModel
import com.apphotel.arch.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AllImageScreenViewModelModule {

    @[Binds IntoMap]
    @ViewModelKey(AllImageScreenViewModel::class)
    fun bindAllImageScreenViewModel(viewModel: AllImageScreenViewModel): ViewModel
}
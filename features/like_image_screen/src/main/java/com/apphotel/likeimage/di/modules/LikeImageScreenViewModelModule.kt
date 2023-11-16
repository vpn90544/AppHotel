package com.apphotel.likeimage.di.modules

import androidx.lifecycle.ViewModel
import com.apphotel.arch.di.ViewModelKey
import com.apphotel.likeimage.presentation.LikeImageScreenViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface LikeImageScreenViewModelModule {

    @[Binds IntoMap]
    @ViewModelKey(LikeImageScreenViewModel::class)
    fun bindLikeImageScreenViewModel(viewModel: LikeImageScreenViewModel): ViewModel
}
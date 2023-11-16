package com.apphotel.apphotel.di.modules

import com.apphotel.allimage.di.modules.AllImageScreenMediatorModule
import com.apphotel.likeimage.di.modules.LikeScreenMediatorModule
import com.apphotel.mainscreen.di.modules.MainScreenMediatorModule
import dagger.Module

@Module(
    includes = [
        MainScreenMediatorModule::class,
        LikeScreenMediatorModule::class,
        AllImageScreenMediatorModule::class
    ]
)
interface MediatorsModule
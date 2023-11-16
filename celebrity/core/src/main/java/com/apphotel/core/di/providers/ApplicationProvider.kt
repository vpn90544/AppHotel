package com.apphotel.core.di.providers

interface ApplicationProvider :
    AndroidDependenciesProvider,
    NetworkProvider,
    MediatorsProvider,
    MainFragmentContainerProvider,
    ContentFragmentContainerProvider
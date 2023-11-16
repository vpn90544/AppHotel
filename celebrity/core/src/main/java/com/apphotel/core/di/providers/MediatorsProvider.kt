package com.apphotel.core.di.providers

import com.apphotel.core.di.mediators.MediatorsMap
import com.apphotel.core.di.qualifiers.MediatorsQualifier

interface MediatorsProvider {

    @MediatorsQualifier
    fun provideMediatorsMap(): MediatorsMap
}
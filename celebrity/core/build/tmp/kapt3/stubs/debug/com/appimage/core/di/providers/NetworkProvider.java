package com.appimage.core.di.providers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/appimage/core/di/providers/NetworkProvider;", "", "provideRetrofit", "Lretrofit2/Retrofit;", "core_debug"})
public abstract interface NetworkProvider {
    
    @com.appimage.core.di.qualifiers.DefaultNetworkApi
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Retrofit provideRetrofit();
}
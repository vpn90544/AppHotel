package com.appimage.core.di.providers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/appimage/core/di/providers/AndroidDependenciesProvider;", "", "provideApplicationContext", "Landroid/app/Application;", "core_debug"})
public abstract interface AndroidDependenciesProvider {
    
    @com.appimage.core.di.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    public abstract android.app.Application provideApplicationContext();
}
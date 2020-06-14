package io.github.jsamol.fp.app.di.module

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import io.github.jsamol.fp.app.FpApp
import io.github.jsamol.fp.app.di.qualifier.ApplicationContext
import io.github.jsamol.fp.app.di.scope.ApplicationScope

@Module
object AppModule {

    @ApplicationScope
    @Provides
    @ApplicationContext
    fun provideApplicationContext(application: FpApp): Context =
        application.applicationContext

    @ApplicationScope
    @Provides
    fun provideSharedPreferences(application: FpApp): SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(application)
}
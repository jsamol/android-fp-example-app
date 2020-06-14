package io.github.jsamol.fp.app.di.module

import android.app.Activity
import android.os.Bundle
import dagger.Module
import dagger.Provides
import io.github.jsamol.fp.app.di.qualifier.ActivityBundle

@Module
abstract class ActivityModule {

    companion object {

        @Provides
        @ActivityBundle
        fun provideExtras(activity: Activity): Bundle = activity.intent.extras ?: Bundle.EMPTY
    }

    @Module
    abstract class BindingModule
}
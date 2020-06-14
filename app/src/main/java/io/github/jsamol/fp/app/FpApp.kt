package io.github.jsamol.fp.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.jsamol.fp.BuildConfig
import io.github.jsamol.fp.app.di.component.DaggerAppComponent
import timber.log.Timber

class FpApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.factory().create(this)

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
package io.github.jsamol.fp.app.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import io.github.jsamol.fp.app.FpApp
import io.github.jsamol.fp.app.di.module.ActivityModule
import io.github.jsamol.fp.app.di.module.AppModule
import io.github.jsamol.fp.app.di.scope.ApplicationScope

@ApplicationScope
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityModule.BindingModule::class
])
interface AppComponent : AndroidInjector<FpApp> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<FpApp>
}
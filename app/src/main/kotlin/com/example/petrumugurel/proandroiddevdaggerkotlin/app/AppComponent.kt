package com.example.petrumugurel.proandroiddevdaggerkotlin

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton
import android.app.Application



/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
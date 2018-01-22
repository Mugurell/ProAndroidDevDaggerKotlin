package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.app.App
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
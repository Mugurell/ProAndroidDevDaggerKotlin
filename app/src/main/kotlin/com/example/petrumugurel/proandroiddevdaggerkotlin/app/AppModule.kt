package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Activity
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Singleton
import android.app.Application



/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Module(includes = [AndroidInjectionModule::class],
        subcomponents = [MainActivitySubcomponent::class])
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideAppContext(app: App): Context

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun provideMainActivityInjector(builder : MainActivitySubcomponent.Builder)
        : AndroidInjector.Factory<out Activity>
}
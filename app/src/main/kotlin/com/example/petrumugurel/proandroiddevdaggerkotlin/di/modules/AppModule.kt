package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.content.Context
import com.example.petrumugurel.proandroiddevdaggerkotlin.app.App
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example1ActivitySubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example2ActivitySubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.MainActivitySubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example3ActivitySubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Singleton


/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Module(includes = [AndroidInjectionModule::class],
        subcomponents = [
            MainActivitySubcomponent::class,
            Example1ActivitySubcomponent::class,
            Example2ActivitySubcomponent::class,
            Example3ActivitySubcomponent::class
        ]
)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideAppContext(app: App): Context

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun provideMainActivityInjector(builder : MainActivitySubcomponent.Builder)
            : AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(Example1Activity::class)
    abstract fun provideExample1ActivityInjector(builer : Example1ActivitySubcomponent.Builder)
        : AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(Example2Activity::class)
    abstract fun provideExample2ActivityInjector(builder : Example2ActivitySubcomponent.Builder)
        : AndroidInjector.Factory<out Activity>

    @Binds
    @IntoMap
    @ActivityKey(Example3Activity::class)
    abstract fun provideExample3ActivityInjector(builder : Example3ActivitySubcomponent.Builder)
        : AndroidInjector.Factory<out Activity>
}
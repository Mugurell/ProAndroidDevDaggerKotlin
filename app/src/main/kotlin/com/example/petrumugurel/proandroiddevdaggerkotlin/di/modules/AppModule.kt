package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.content.Context
import com.example.petrumugurel.proandroiddevdaggerkotlin.app.App
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton


/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Module(includes = [AndroidInjectionModule::class]
)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideAppContext(app: App): Context

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivityInjector(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [Example1ActivityModule::class])
    abstract fun provideExample1ActivityInjector(): Example1Activity

    @PerActivity
    @ContributesAndroidInjector(modules = [Example2ActivityModule::class])
    abstract fun provideExample2ActivityInjector(): Example2Activity

    @PerActivity
    @ContributesAndroidInjector(modules = [Example3ActivityModule::class])
    abstract fun provideExample3ActivityInjector(): Example3Activity
}
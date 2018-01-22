package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseActivityModule::class])
abstract class Example1ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example1Activity : Example1Activity): Activity

    @PerFragment
    @ContributesAndroidInjector(modules = [Example1FragmentModule::class])
    abstract fun provideEx1FragmentInjectorFactory(): Example1Fragment
}
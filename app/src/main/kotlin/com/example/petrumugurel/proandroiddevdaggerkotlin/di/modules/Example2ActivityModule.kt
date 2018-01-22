package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2AFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2BFragment
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
abstract class Example2ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example2Activity : Example2Activity): Activity

    @PerFragment
    @ContributesAndroidInjector(modules = [Example2AFragmentModule::class])
    abstract fun provideEx2AFragmentInjectorFactory(): Example2AFragment

    @PerFragment
    @ContributesAndroidInjector(modules = [Example2BFragmentModule::class])
    abstract fun provideEx2BFragmentInjectorFactory(): Example2BFragment
}
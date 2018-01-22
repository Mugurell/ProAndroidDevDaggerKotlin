package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example1FragmentSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseActivityModule::class],
        subcomponents = [Example1FragmentSubcomponent::class])
abstract class Example1ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example1Activity : Example1Activity): Activity

    @Binds
    @IntoMap
    @FragmentKey(Example1Fragment::class)
    abstract fun provideEx1FragmentInjectorFactory(builder : Example1FragmentSubcomponent.Builder)
        : AndroidInjector.Factory<out Fragment>
}
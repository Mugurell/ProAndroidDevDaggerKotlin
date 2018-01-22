package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2AFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2BFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example2AFragmentSubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example2BFragmentSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 22.01.2018.
 */


@Module(includes = [BaseActivityModule::class],
        subcomponents = [
            Example2AFragmentSubcomponent::class,
            Example2BFragmentSubcomponent::class])
abstract class Example2ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example2Activity : Example2Activity): Activity

    @Binds
    @IntoMap
    @FragmentKey(Example2AFragment::class)
    abstract fun provideEx2AFragmentInjectorFactory(builder : Example2AFragmentSubcomponent.Builder)
        : AndroidInjector.Factory<out Fragment>

    @Binds
    @IntoMap
    @FragmentKey(Example2BFragment::class)
    abstract fun provideEx2BFragmentInjectorFactory(builder : Example2BFragmentSubcomponent.Builder)
        : AndroidInjector.Factory<out Fragment>
}
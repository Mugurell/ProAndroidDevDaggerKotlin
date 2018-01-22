package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ParentFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example3ParentFragmentSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseActivityModule::class],
        subcomponents = [Example3ParentFragmentSubcomponent::class])
abstract class Example3ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example3Activity : Example3Activity): Activity

    @Binds
    @IntoMap
    @FragmentKey(Example3ParentFragment::class)
    abstract fun provideEx3ParentFragmentInjectorFactory(
            builder : Example3ParentFragmentSubcomponent.Builder
    ) : AndroidInjector.Factory<out Fragment>
}
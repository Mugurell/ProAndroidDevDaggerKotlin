package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.Example3ChildFragmentSubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ParentFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap
import javax.inject.Named

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseFragmentModule::class],
        subcomponents = [Example3ChildFragmentSubcomponent::class])
abstract class Example3ParentFragmentModule {
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    abstract fun provideFragment(example3ParentFragment : Example3ParentFragment): Fragment


    @Binds
    @IntoMap
    @FragmentKey(Example3ChildFragment::class)
    abstract fun provideEx3ChildFragmentInjectorFactory(builder : Example3ChildFragmentSubcomponent.Builder)
        : AndroidInjector.Factory<out Fragment>
}
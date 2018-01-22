package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ParentFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Named

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseFragmentModule::class])
abstract class Example3ParentFragmentModule {
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    abstract fun provideFragment(example3ParentFragment : Example3ParentFragment): Fragment

    @PerChildFragment
    @ContributesAndroidInjector(modules = [Example3ChildFragmentModule::class])
    abstract fun provideEx3ChildFragmentInjectorFactory(): Example3ChildFragment
}
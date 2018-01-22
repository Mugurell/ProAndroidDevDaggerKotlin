package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ChildFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseChildFragmentModule::class])
abstract class Example3ChildFragmentModule {
    @Binds
    @PerChildFragment
    @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
    abstract fun provideFragment(example3ChildFragment : Example3ChildFragment): Fragment
}
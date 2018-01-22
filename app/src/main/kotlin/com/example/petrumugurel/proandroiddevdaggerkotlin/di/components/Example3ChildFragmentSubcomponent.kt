package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example3ChildFragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ChildFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerChildFragment
@Subcomponent(modules = [Example3ChildFragmentModule::class])
interface Example3ChildFragmentSubcomponent : AndroidInjector<Example3ChildFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example3ChildFragment>()
}
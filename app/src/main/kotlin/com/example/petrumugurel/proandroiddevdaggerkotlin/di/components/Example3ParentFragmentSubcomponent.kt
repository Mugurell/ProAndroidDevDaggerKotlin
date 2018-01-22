package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example3ParentFragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ParentFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerFragment
@Subcomponent(modules = [Example3ParentFragmentModule::class])
interface Example3ParentFragmentSubcomponent : AndroidInjector<Example3ParentFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example3ParentFragment>()
}
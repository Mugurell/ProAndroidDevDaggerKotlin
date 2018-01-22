package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2BFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example2BFragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerFragment
@Subcomponent(modules = [Example2BFragmentModule::class])
interface Example2BFragmentSubcomponent : AndroidInjector<Example2BFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example2BFragment>()
}
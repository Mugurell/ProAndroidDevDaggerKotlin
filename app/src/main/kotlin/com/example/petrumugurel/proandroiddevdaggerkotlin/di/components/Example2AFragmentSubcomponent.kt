package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2AFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example2AFragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerFragment
@Subcomponent(modules = [Example2AFragmentModule::class])
interface Example2AFragmentSubcomponent : AndroidInjector<Example2AFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example2AFragment>()
}
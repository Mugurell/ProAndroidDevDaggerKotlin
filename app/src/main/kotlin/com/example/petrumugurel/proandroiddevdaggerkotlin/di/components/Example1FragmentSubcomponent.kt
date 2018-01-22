package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example1FragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerFragment
@Subcomponent(modules = [Example1FragmentModule::class])
interface Example1FragmentSubcomponent
    : AndroidInjector<Example1Fragment>
{
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example1Fragment>()
}
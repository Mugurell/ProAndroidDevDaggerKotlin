package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.MainFragmentModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@PerFragment
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentSubcomponent : AndroidInjector<MainFragment>{
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainFragment>()
}
package com.example.petrumugurel.proandroiddevdaggerkotlin

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
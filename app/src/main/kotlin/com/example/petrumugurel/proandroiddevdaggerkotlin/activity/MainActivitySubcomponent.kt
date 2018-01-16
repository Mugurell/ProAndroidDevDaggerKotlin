package com.example.petrumugurel.proandroiddevdaggerkotlin

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@PerActivity
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
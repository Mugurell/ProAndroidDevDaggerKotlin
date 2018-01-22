package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example2ActivityModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerActivity
@Subcomponent(modules = [Example2ActivityModule::class])
interface Example2ActivitySubcomponent : AndroidInjector<Example2Activity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example2Activity>()
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example3ActivityModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerActivity
@Subcomponent(modules = [Example3ActivityModule::class])
interface Example3ActivitySubcomponent : AndroidInjector<Example3Activity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example3Activity>()
}
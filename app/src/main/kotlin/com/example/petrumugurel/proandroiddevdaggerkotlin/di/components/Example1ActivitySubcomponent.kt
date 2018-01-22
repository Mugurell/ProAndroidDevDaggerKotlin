package com.example.petrumugurel.proandroiddevdaggerkotlin.di.components

import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.Example1ActivityModule
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@PerActivity
@Subcomponent(modules = [Example1ActivityModule::class])
interface Example1ActivitySubcomponent :
        AndroidInjector<Example1Activity>
{
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Example1Activity>()
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3ParentFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseActivityModule::class])
abstract class Example3ActivityModule {
    @Binds
    @PerActivity
    abstract fun provideActivity(example3Activity : Example3Activity): Activity

    @PerFragment
    @ContributesAndroidInjector(modules = [Example3ParentFragmentModule::class])
    abstract fun provideEx3ParentFragmentInjectorFactory(): Example3ParentFragment
}
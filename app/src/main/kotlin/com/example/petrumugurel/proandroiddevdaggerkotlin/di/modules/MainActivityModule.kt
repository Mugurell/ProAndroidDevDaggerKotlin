package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.MainFragmentListener
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.components.MainFragmentSubcomponent
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@Module(includes = [BaseActivityModule::class],
        subcomponents = [MainFragmentSubcomponent::class])
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun provideMainFragmentInjectorFactory(builder : MainFragmentSubcomponent.Builder)
        : AndroidInjector.Factory<out Fragment>

    @Binds
    @PerActivity
    abstract fun provideActivity(mainActivity : MainActivity): Activity

    @Binds
    @PerActivity
    abstract fun provideMainFragmentListener(activity : MainActivity): MainFragmentListener
}
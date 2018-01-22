package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.MainFragmentListener
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@Module(includes = [BaseActivityModule::class])
abstract class MainActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun provideMainFragmentInjectorFactory(): MainFragment

    @Binds
    @PerActivity
    abstract fun provideActivity(mainActivity : MainActivity): Activity

    @Binds
    @PerActivity
    abstract fun provideMainFragmentListener(activity : MainActivity): MainFragmentListener
}
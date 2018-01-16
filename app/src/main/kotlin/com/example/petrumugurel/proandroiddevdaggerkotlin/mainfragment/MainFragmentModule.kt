package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Fragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@Module(includes = [BaseFragmentModule::class])
abstract class MainFragmentModule {
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract fun provideFragment(mainFragment : MainFragment): Fragment
}
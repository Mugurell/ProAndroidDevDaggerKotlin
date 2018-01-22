package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2AFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * Created by petru.lingurar on 22.01.2018.
 */

@Module(includes = [BaseFragmentModule::class])
abstract class Example2AFragmentModule {
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract fun provideFragment(example2AFragment : Example2AFragment): Fragment
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Fragment
import android.app.FragmentManager
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Module
object BaseFragmentModule {
    const val FRAGMENT = "BaseFragmentModule.fragment"
    const val CHILD_FRAGMENT_MANAGER = "BaseFragmentManager.childFragmentManager"

    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    @JvmStatic
    fun provideFragmentsFragmentManager(@Named(FRAGMENT) fragment : Fragment) : FragmentManager
        = fragment.childFragmentManager
}
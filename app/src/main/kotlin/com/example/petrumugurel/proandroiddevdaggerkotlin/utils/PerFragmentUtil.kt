package com.example.petrumugurel.proandroiddevdaggerkotlin.utils

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.BaseFragmentModule
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */

@PerFragment
class PerFragmentUtil @Inject constructor(
        @param:Named(BaseFragmentModule.FRAGMENT)private val fragment : Fragment
) {
    fun doSomething() = "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode()
}
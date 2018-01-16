package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Fragment
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
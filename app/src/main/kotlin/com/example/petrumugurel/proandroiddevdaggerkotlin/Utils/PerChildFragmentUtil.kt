package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Fragment
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */

@PerChildFragment
class PerChildFragmentUtil @Inject constructor(
        @param:Named(BaseChildFragmentModule.CHILD_FRAGMENT) private val fragment : Fragment
) {
    fun doSomething() =
            "PerChildFragmentUtil: " + hashCode() + ", child Fragment: " + fragment.hashCode()
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.utils

import android.app.Fragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerChildFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.BaseChildFragmentModule
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
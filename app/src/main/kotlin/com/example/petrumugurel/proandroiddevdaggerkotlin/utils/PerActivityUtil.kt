package com.example.petrumugurel.proandroiddevdaggerkotlin.utils

import android.app.Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import javax.inject.Inject

/**
 * Created by petru.lingurar on 16.01.2018.
 */

@PerActivity
class PerActivityUtil @Inject constructor(private val activity : Activity){
    fun doSomething() = "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode()
}
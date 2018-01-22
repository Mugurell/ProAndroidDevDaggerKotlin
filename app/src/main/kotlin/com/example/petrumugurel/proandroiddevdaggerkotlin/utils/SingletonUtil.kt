package com.example.petrumugurel.proandroiddevdaggerkotlin.utils

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by petru.lingurar on 15.01.2018.
 */


@Singleton
class SingletonUtil @Inject constructor(){
    fun doSomething() = "SingletonUtil: " + hashCode()
}
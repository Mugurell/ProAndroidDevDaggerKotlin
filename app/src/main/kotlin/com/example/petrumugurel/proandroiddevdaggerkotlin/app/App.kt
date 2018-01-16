package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by petru.lingurar on 15.01.2018.
 */

class App :
        Application(),
        HasActivityInjector
{
    @Inject
    @JvmField
    var activityInjector : DispatchingAndroidInjector<Activity>? = null

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().create(this).inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector!!
}
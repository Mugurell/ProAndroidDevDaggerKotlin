package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.annotation.IdRes
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules.BaseActivityModule
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */


abstract class BaseActivity :
        Activity(),
        HasFragmentInjector
{
    @Inject
    @JvmField
    protected var fragmentInjector : DispatchingAndroidInjector<Fragment>? = null

    @Inject
    @field:Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
    @JvmField
    protected var activitysFragmentManager : FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> = fragmentInjector!!

    protected fun addFragment(@IdRes containerViewId : Int, fragment : Fragment) {
        activitysFragmentManager!!.beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}
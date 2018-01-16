package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.content.Context
import android.os.Build
import android.support.annotation.IdRes
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */

abstract class BaseFragment :
        Fragment(),
        HasFragmentInjector
{
    @Inject
    @JvmField
    protected var fragmentInjector : DispatchingAndroidInjector<Fragment>? = null

    @Inject
    @JvmField
    @ActivityContext
    protected var activityContext : Context? = null

    @Inject
    @field:Named(BaseFragmentModule.CHILD_FRAGMENT_MANAGER)
    @JvmField
    protected var fragmentsFragmentManager : FragmentManager? = null

    override fun onAttach(context: Context?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            AndroidInjection.inject(this)
        }
        super.onAttach(context)
    }

    override fun onAttach(activity: Activity?) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            AndroidInjection.inject(this)
        }
        super.onAttach(activity)
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> = fragmentInjector!!

    protected fun addChildFragment(@IdRes containerViewId : Int, fragment : Fragment) {
        fragmentsFragmentManager?.let {
            it.beginTransaction()
                .add(containerViewId, fragment)
                .commit()
        }
    }
}
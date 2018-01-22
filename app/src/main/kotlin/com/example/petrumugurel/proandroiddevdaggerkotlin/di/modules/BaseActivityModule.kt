package com.example.petrumugurel.proandroiddevdaggerkotlin.di.modules

import android.app.Activity
import android.app.FragmentManager
import android.content.Context
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Qualifiers.ActivityContext
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by petru.lingurar on 15.01.2018.
 */

@Module
abstract class BaseActivityModule {
    @Binds
    @PerActivity
    @ActivityContext
    abstract fun provideActivityContext(activity : Activity): Context

    @Module
    companion object {
        const val ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager"

        @Provides
        @Named(ACTIVITY_FRAGMENT_MANAGER)
        @PerActivity
        @JvmStatic
        fun provideActivityFragmentManager(activity: Activity) : FragmentManager = activity.fragmentManager
    }
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1

import android.os.Bundle
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.BaseActivity

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example1Activity :
        BaseActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.example_1_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, Example1Fragment())
        }
    }
}
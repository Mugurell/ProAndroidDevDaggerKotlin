package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2

import android.os.Bundle
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.BaseActivity

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example2Activity
    : BaseActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_2_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_a_container, Example2AFragment())
            addFragment(R.id.fragment_b_container, Example2BFragment())
        }
    }
}
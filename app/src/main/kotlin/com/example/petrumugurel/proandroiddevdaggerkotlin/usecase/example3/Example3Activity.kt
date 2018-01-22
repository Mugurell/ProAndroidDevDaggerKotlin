package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3

import android.os.Bundle
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.BaseActivity

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example3Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_3_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.parent_fragment_container, Example3ParentFragment())
        }
    }
}
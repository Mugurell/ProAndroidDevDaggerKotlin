package com.example.petrumugurel.proandroiddevdaggerkotlin

import android.os.Bundle
import android.widget.Toast

/**
 * Created by petru.lingurar on 16.01.2018.
 */

class MainActivity :
        BaseActivity(),
        MainFragmentListener
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, MainFragment())
        }
    }

    override fun onExample1Clicked() {
        Toast.makeText(this, "Launch example 1", Toast.LENGTH_SHORT).show()
    }

    override fun onExample2Clicked() {
        Toast.makeText(this, "Launch example 2", Toast.LENGTH_SHORT).show()
    }

    override fun onExample3Clicked() {
        Toast.makeText(this, "Launch example 3", Toast.LENGTH_SHORT).show()
    }
}
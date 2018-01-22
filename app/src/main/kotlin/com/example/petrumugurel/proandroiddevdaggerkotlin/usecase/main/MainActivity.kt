package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1.Example1Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.BaseActivity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2.Example2Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3.Example3Activity
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.MainFragmentListener

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
        startActivity(Intent(this, Example1Activity::class.java))
    }

    override fun onExample2Clicked() {
        Toast.makeText(this, "Launch example 2", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, Example2Activity::class.java))
    }

    override fun onExample3Clicked() {
        Toast.makeText(this, "Launch example 3", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, Example3Activity::class.java))
    }
}
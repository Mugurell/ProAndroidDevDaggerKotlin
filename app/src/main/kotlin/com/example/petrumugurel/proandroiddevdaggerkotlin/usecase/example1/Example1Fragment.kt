package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example1

import android.widget.Button
import android.widget.TextView
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.DetailFragment
import kotlinx.android.synthetic.main.example_1_fragment.*

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example1Fragment
    : DetailFragment()
{
    override fun getFragmentLayout(): Int = R.layout.example_1_fragment

    override fun getActionButton(): Button = do_something

    override fun getDisplayeableTextView(): TextView = some_text
}
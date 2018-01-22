package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example2

import android.widget.Button
import android.widget.TextView
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.DetailFragment
import kotlinx.android.synthetic.main.example_2_fragment_a.*

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example2AFragment
    : DetailFragment()
{
    override fun getFragmentLayout(): Int = R.layout.example_2_fragment_a

    override fun getActionButton(): Button = do_something

    override fun getDisplayeableTextView(): TextView = some_text
}
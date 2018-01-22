package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.DetailFragment
import kotlinx.android.synthetic.main.example_3_parent_fragment.*

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example3ParentFragment :
        DetailFragment()
{
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            addChildFragment(R.id.child_fragment_container, Example3ChildFragment())
        }
    }

    override fun getFragmentLayout(): Int = R.layout.example_3_parent_fragment

    override fun getActionButton(): Button = do_something

    override fun getDisplayeableTextView(): TextView = some_text


}
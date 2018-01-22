package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.example3

import android.widget.Button
import android.widget.TextView
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.di.Scopes.PerFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.DetailFragment
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.PerChildFragmentUtil
import kotlinx.android.synthetic.main.example_3_child_fragment.*
import javax.inject.Inject

/**
 * Created by petru.lingurar on 22.01.2018.
 */

class Example3ChildFragment :
        DetailFragment()
{
    @Inject
    @JvmField
    protected var perChildFragmentUtil : PerChildFragmentUtil? = null

    override fun onActionButtonClicked() {
        showSomething("""
            |${singletonUtil?.doSomething()}
            |${perActivityUtil?.doSomething()}
            |${perFragmentUtil?.doSomething()}
            |${perChildFragmentUtil?.doSomething()}
            """.trimMargin()
        )
    }

    override fun getFragmentLayout(): Int = R.layout.example_3_child_fragment

    override fun getActionButton(): Button = do_something

    override fun getDisplayeableTextView(): TextView = some_text
}
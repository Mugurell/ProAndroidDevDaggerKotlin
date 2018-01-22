package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.PerActivityUtil
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.PerFragmentUtil
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.SingletonUtil
import javax.inject.Inject

/**
 * Created by petru.lingurar on 22.01.2018.
 */

abstract class DetailFragment :
        BaseFragment(),
        View.OnClickListener
{
    @Inject
    @JvmField
    protected var singletonUtil : SingletonUtil? = null

    @Inject
    @JvmField
    protected var perActivityUtil : PerActivityUtil? = null

    @Inject
    @JvmField var perFragmentUtil : PerFragmentUtil? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(getFragmentLayout(), container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getActionButton().setOnClickListener(this)
    }

    override fun onClick(clickedView: View?) {
        clickedView?.run {
            when(clickedView.id) {
                getActionButton().id -> onActionButtonClicked()
                else -> throw IllegalArgumentException("Unhandled view: $(this.id)")
            }
        }
    }

    protected open fun onActionButtonClicked() {
        showSomething("""
            |${singletonUtil?.doSomething()}
            |${perActivityUtil?.doSomething()}
            |${perFragmentUtil?.doSomething()}
            """.trimMargin())
    }

    protected open fun showSomething(message : String?) {
        getDisplayeableTextView().text = message
    }

    abstract fun getFragmentLayout(): Int
    abstract fun getActionButton(): Button
    abstract fun getDisplayeableTextView(): TextView
}
package com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.petrumugurel.proandroiddevdaggerkotlin.utils.MainFragmentListener
import com.example.petrumugurel.proandroiddevdaggerkotlin.R
import com.example.petrumugurel.proandroiddevdaggerkotlin.usecase.BaseFragment
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

/**
 * Created by petru.lingurar on 15.01.2018.
 */

class MainFragment :
        BaseFragment(),
        View.OnClickListener
{
    @Inject
    @JvmField
    protected var listener : MainFragmentListener? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        example_1.setOnClickListener(this)
        example_2.setOnClickListener(this)
        example_3.setOnClickListener(this)
    }

    override fun onClick(clickedView: View?) {
        clickedView?.let {
            when (clickedView.id) {
                R.id.example_1 -> onExample1Clicked()
                R.id.example_2 -> onExample2Clicked()
                R.id.example_3 -> onExample3Clicked()
                else -> throw IllegalArgumentException("UnhandledView: " + clickedView.id)
            }
        }
    }

    private fun onExample1Clicked() = listener?.onExample1Clicked()
    private fun onExample2Clicked() = listener?.onExample2Clicked()
    private fun onExample3Clicked() = listener?.onExample3Clicked()
}
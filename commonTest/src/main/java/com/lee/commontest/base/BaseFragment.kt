package com.lee.commontest.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {


    lateinit var showView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        showView = View.inflate(activity, getShowView(), null)
        initView()
        initData()
        return showView
    }

    abstract fun getShowView(): Int

    abstract fun initView()
    abstract fun initData()


    fun showToast(msg: String) {
        activity?.showToast(msg)
    }
}
package com.lee.commontest.base

import android.app.Activity
import android.os.Bundle

abstract class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getViewId())
        initView()
        initData()


//        nextActivity(BaseActivity::class.java)
//        nextActivity(BaseFragment::class.java)
    }


    abstract fun getViewId(): Int
    abstract fun initView()
    abstract fun initData()
}
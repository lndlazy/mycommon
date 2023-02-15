package com.lee.commontest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lee.commontest.bean.Banner

class BannerViewModel : ViewModel() {

    val mBannerViewModel = MutableLiveData<List<Banner>>()

    fun getBanner() {


//        viewModeScope

    }

}
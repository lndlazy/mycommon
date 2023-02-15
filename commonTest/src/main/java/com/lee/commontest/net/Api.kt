package com.lee.commontest.net

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.fastjson.FastJsonConverterFactory

class Api private constructor(){


    companion object {

        val INSTANCE by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
              Api()
        }

    }


    private val api by lazy {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.wanandroid.com/")
            .addConverterFactory(FastJsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build()
        retrofit.create(IApi::class.java)

    }


    fun get(): IApi = api


}
package com.lee.commontest.net

import com.lee.commontest.bean.Banner
import retrofit2.http.GET

interface IApi {

    /**
     * 创建 Retrofit Api 接口，Retrofit 自 2.6 版本开始，原生支持了协程
     * ，我们只需要在方法前添加 suspend 修饰符，即可直接返回实体对象
     */
    @GET("banner/json")
    suspend fun  getBanner(): ResponseResult<List<Banner>>
}
package com.lee.commontest.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.lee.commontest.BuildConfig

class CommonApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        println("========  CommonApplication ->> onCreate <<- ============")

        initARouter()

    }


    /**
     * 初始化ARouter
     */
    private fun initARouter() {

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

    }


}
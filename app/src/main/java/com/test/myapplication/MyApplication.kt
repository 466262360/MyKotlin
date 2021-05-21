package com.test.myapplication

import android.app.Application
import androidx.viewbinding.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Created by Administrator on 2021/5/21.
 * Des:
 */
class MyApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }
}
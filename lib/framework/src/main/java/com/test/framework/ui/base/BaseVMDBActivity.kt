package com.test.framework.ui.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by Administrator on 2021/5/28.
 * Des:
 */
abstract class BaseVMDBActivity<VM:BaseViewModel,DB:ViewDataBinding>:BaseVMActivity<VM>() {
    lateinit var mDataBind:DB
    override fun initDataBinding() {
         mDataBind = DataBindingUtil.setContentView(this, getLayout())
        mDataBind.lifecycleOwner=this
    }
}
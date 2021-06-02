package com.test.myapplication

import com.test.framework.ui.base.BaseActivity
import com.test.framework.ui.base.BaseViewModel
import com.test.myapplication.databinding.ActivityMainBinding

class MainActivity : BaseActivity<BaseViewModel,ActivityMainBinding>() {
    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun getLayout()=R.layout.activity_main

    override fun createObserver() {

    }

}
package com.test.framework.ui.base

import androidx.databinding.ViewDataBinding

/**
 * Created by Administrator on 2021/5/21.
 * Des:
 */
abstract class BaseActivity<VM : BaseViewModel, DB : ViewDataBinding> : BaseVMDBActivity<VM, DB>() {

    abstract override fun getLayout(): Int

    abstract override fun initView()

    override fun createObserver() {
        TODO("Not yet implemented")
    }

    override fun showLoading(it: String) {
        TODO("Not yet implemented")
    }
    override fun dismissLoading() {
        TODO("Not yet implemented")
    }


}
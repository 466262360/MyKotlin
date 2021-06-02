package com.test.framework.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.test.framework.ext.getVMClass

/**
 * Created by Administrator on 2021/5/27.
 * Des:
 */
abstract class BaseVMActivity<VM : BaseViewModel> : AppCompatActivity() {
    lateinit var viewModel: VM
    abstract fun createObserver()

    abstract fun initView()

    abstract fun initDataBinding()

    abstract fun showLoading(it: String = "加载中...")

    abstract fun dismissLoading()

    abstract fun getLayout():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
        init()
    }

    private fun init() {
        viewModel = createViewModel()
        registerUIChange()
        initView()
        createObserver()
    }

    private fun registerUIChange() {
        viewModel.uiChange.showDialog.observeInActivity(this, Observer {
            showLoading(it)
        })
        viewModel.uiChange.dismissDialog.observeInActivity(this, Observer {
            dismissLoading()
        })
    }

    private fun createViewModel(): VM {
        return ViewModelProvider(this).get(getVMClass(this))
    }


}

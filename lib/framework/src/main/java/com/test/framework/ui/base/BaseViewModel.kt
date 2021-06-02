package com.test.framework.ui.base

import androidx.lifecycle.ViewModel
import com.kunminx.architecture.ui.callback.UnPeekLiveData

/**
 * Created by Administrator on 2021/5/27.
 * Des:
 */
class BaseViewModel :ViewModel(){

    val uiChange by lazy{ UiChange()}
    inner class UiChange{
        val showDialog by lazy { UnPeekLiveData<String>() }
        val dismissDialog by lazy { UnPeekLiveData<Boolean>() }
    }
}
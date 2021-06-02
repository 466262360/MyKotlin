package com.test.framework.ext

import java.lang.reflect.ParameterizedType

/**
 * Created by Administrator on 2021/5/28.
 * Des:
 */
@Suppress("UNCHECKED_CAST")
fun <VM> getVMClass(obj:Any):VM{
    return (obj.javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as VM
}
package com.shangzuo.mvvm.base

import android.view.View
import androidx.viewbinding.ViewBinding
import com.shangzuo.mvvm.ext.inflateBinding


/**
 * 描述　:
 */
abstract class BaseVBActivity<VM : BaseViewModel,VB: ViewBinding> : BaseVmActivity<VM>(),BaseIView {

    //使用了 ViewBinding 就不需要 layoutId了，因为 会从 VB 泛型 找到相关的view
    override val layoutId: Int = 0
    lateinit var mBind: VB

    override fun initViewDataBind(): View? {
        //利用反射 根据泛型得到 ViewDataBinding
        mBind = inflateBinding()
        //BackgroundLibrary.inject(this)
        return mBind.root
    }
}
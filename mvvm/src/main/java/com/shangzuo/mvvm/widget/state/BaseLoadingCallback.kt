package com.shangzuo.mvvm.widget.state

import android.content.Context
import android.view.View
import com.shangzuo.mvvm.R
import com.shangzuo.mvvm.loadsir.callback.Callback


/**
 * 描述　:
 */
class BaseLoadingCallback: Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_base_loading
    }

    /**
     * 是否是 点击不可重试
     */
    override fun onReloadEvent(context: Context?, view: View?): Boolean {
        return true
    }
}
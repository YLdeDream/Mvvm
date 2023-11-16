package com.shangzuo.mvvm.widget.state

import com.shangzuo.mvvm.R
import com.shangzuo.mvvm.loadsir.callback.Callback

/**
 * 描述　:
 */
class BaseEmptyCallback() : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_base_empty
    }

}
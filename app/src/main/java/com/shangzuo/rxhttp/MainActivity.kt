package com.shangzuo.rxhttp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.AppUtils
import com.shangzuo.mvvm.BaseUtils
import com.vi.vioserial.COMSerial


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // AppUtils.getAppVersionName()
        AppUtils.getAppVersionName()


        BaseUtils.getTest()
    }
}
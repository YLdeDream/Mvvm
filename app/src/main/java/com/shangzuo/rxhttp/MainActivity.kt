package com.shangzuo.rxhttp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shangzuo.mvvm.BaseUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        BaseUtils.getTest()
    }
}
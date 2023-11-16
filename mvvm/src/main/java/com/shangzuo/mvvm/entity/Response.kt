package com.shangzuo.mvvm.entity


data class Response<T>(
    var data: T,
    var code: Int = -1,
    var msg: String = ""
)
package com.shangzuo.mvvm.entity

/**
 * 分页帮助类
 */
abstract class  BasePage<T> (
    val pageSize: Int,
    val pageIndex: Int,
    val totalNum: Int,
    val totalPage: Int,
    var result: List<T> = listOf(),
)
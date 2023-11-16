package com.shangzuo.mvvm.api

import rxhttp.wrapper.annotation.DefaultDomain


object NetUrl {

    // 服务器请求成功的 Code值
    const val SUCCESS_CODE = 200

    @DefaultDomain //设置为默认域名
    const val DEV_URL = "http://192.168.2.44:9988"

    //登录
    const val LOGIN = "/business/SzBaseuser/Login"


    //获取柜子信息
    const val CABINET_INFO = "/business/hightcabinet/GetCabinetList"

    //物品存入
    const val INSTORE = "/business/hightcabinet/InStore"
    //添加盘点单
    const val ADD_INVENTORY = "/business/SzCheckorder/AddCheckOrder"
    //待退货记录
    const val BE_RUFUND_LIST = "/business/SzRefundorder/GetBeRefundList"
    //退货
    const val TO_REFUND = "/business/SzRefundorder/AddRefundorder"
    //近效期预警
    const val DATE_WARNNING = "/business/hightcabinet/GetExpriedWarn"

    //近效期预警
    const val STOCK_WARNNING = "/business/CabinetStore/GetList"

    //入库单列表
    const val LIST_INSTORE = "/business/SzInoutorder/GetOrderList"
    //入库单详情
    const val DETAIL_INSTORE = "/business/SzInoutorderDetail/list"
    //添加开门记录
    const val RECORD_OPEN = "/business/SzOpendoorrecord"

    //开门记录列表
    const val LIST_OPEN = "/business/SzOpendoorrecord/list"

    //操作记录列表
    const val LIST_OPERATION = "/business/SzTextilelog/list"


    //未使用记录
    const val LIST_NOT_USED = "/business/SzTakeofforderDetail/nousedlist"

    //断网存取记录
    const val LIST_ERROR = "/business/InOutTakeOffRecord/offlinelist"

    //断网存取记录
    const val LIST_STOCK = "/business/hightcabinet/GetCabinetStoreList"
    //取用记录
    const val LIST_TAKE_AWAY = "/business/SzTakeofforder/GetList"
    //归还记录
    const val LIST_RETURN = "/business/SzGivebackorder/GetList"
    //退货记录单
    const val LIST_REFUND_LIST = "/business/SzRefundorder/list"

    //取用记录单据详情
    const val DETAIL_TAKE_AWAY = "/business/SzTakeofforderDetail/list"

    //归还单据详情
    const val DETAIL_RETURN = "/business/SzGivebackorderDetail/list"
    const val DETAIL_REFUND = "/business/SzRefundorderDetail/list"


    //用户列表
    const val LIST_USER = "/business/SzBaseuser/list"
    //更新用户信息
    const val UPDATE_USER = "/business/SzBaseuser/SaveBaseUser"


    const val UPLOAD_URL = ""
    const val DOWNLOAD_URL = ""
}
package com.shangzuo.mvvm.api

import com.shangzuo.mvvm.net.interception.LogInterceptor
import okhttp3.OkHttpClient
import rxhttp.RxHttpPlugins
import java.util.concurrent.TimeUnit
import rxhttp.wrapper.ssl.HttpsUtils



object NetHttpClient {

    fun init(){
        RxHttpPlugins.init(getDefaultOkHttpClient().build())
    }

    fun getDefaultOkHttpClient():  OkHttpClient.Builder {
        //RxHttp[https://github.com/liujingxing/rxhttp] 文档
        val sslParams = HttpsUtils.getSslSocketFactory()
        return OkHttpClient.Builder()
            //使用CookieStore对象磁盘缓存,自动管理cookie
            //.cookieJar(CookieStore(File(appContext.externalCacheDir, "RxHttpCookie")))
            .connectTimeout(15, TimeUnit.SECONDS)//读取连接超时时间 15秒
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(HeadInterceptor())//自定义头部参数拦截器
            .addInterceptor(LogInterceptor())//添加Log拦截器
            .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager) //添加信任证书
            .hostnameVerifier { hostname, session -> true } //忽略host验证
    }
}
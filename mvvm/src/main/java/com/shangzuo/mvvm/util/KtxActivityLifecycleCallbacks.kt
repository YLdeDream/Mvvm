package com.shangzuo.mvvm.util

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.shangzuo.mvvm.ext.addActivity
import com.shangzuo.mvvm.ext.removeActivity


/**
 * 描述　:
 */
class KtxActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {

    override fun onActivityPaused(activity: Activity) {
        XLog.d(activity.javaClass.simpleName)
    }

    override fun onActivityStarted(p0: Activity) {

    }

    override fun onActivityDestroyed(activity: Activity) {
        removeActivity(activity)
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
    }

    override fun onActivityStopped(p0: Activity) {
    }

    override fun onActivityCreated(activity: Activity, p1: Bundle?) {
        XLog.d(activity.javaClass.simpleName)
        addActivity(activity)
    }

    override fun onActivityResumed(activity: Activity) {
        XLog.d(activity.javaClass.simpleName)
    }

}
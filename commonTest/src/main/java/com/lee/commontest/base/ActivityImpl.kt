package com.lee.commontest.base


import android.app.Activity
import android.content.Intent
import android.os.Looper
import android.widget.Toast

/**
 * 弹toast
 */
fun Activity.showToast(msg: String) {

    if (Thread.currentThread() == Looper.getMainLooper().thread) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    } else {
        runOnUiThread {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }

}

/**
 * 跳转到下一个页面
 */
//fun <T> Activity.nextActivity(clazz: Class<T>) {
fun Activity.nextActivity(clazz: Class<*>) {
    val jumpIntent = Intent(this, clazz::class.java)
    startActivity(jumpIntent)
}

/**
 * 跳转到下一个页面,然后销毁当前页面
 */
fun Activity.nextActivityThenFinish(clazz: Class<Activity>) {
    val jumpIntent = Intent(this, clazz::class.java)
    startActivity(jumpIntent)
    finish()
}
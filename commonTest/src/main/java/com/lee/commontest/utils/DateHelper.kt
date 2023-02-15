package com.lee.commontest.utils

import java.text.DateFormat
import java.util.*

object DateHelper {

    val FORMAT_ALL_1 = "yyyy/MM/dd-HH:mm:ss"
    val FORMAT_Y = "yyyy"
    val FORMAT_MDHM = "MM-dd HH:mm"


    fun getStrByFormat(date: Date, format: DateFormat) = format.format(date)

}
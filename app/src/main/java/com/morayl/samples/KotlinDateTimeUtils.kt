package com.morayl.samples

import java.util.Date

object KotlinDateTimeUtils {
    fun getNow(): String {
        return Date().toString()
    }

    fun getFormat(): String {
        return "yyyymmdd HH:mm"
    }
}
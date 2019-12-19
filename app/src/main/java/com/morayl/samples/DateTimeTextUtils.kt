package com.morayl.samples

object DateTimeTextUtils {
    fun nowWithDecoration(): String {
        return "DateTime is:" + KotlinDateTimeUtils.getNow()
    }

    fun createSumTextWithJava(): String {
        return "DateTime is:" + JavaDateTimeUtils.getNow()
    }
}
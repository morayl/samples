package com.morayl.samples

import io.mockk.every
import io.mockk.mockkObject
import io.mockk.mockkStatic
import org.amshove.kluent.shouldEqual
import org.junit.Before
import org.junit.Test

class StaticMockExample {

    @Before
    fun setup() {
        // mock Kotlin object
        mockkObject(KotlinDateTimeUtils)
        // mock Java static class
        mockkStatic(JavaDateTimeUtils::class)
    }

    @Test
    fun kotlinObjectTest() {
        every { KotlinDateTimeUtils.getNow() } returns "2019-11-11 10:00"
        DateTimeTextUtils.nowWithDecoration() shouldEqual "DateTime is:2019-11-11 10:00"
    }

    @Test
    fun javaStaticTest() {
        every { JavaDateTimeUtils.getNow() } returns "2019-11-11 10:00"
        DateTimeTextUtils.createSumTextWithJava() shouldEqual "DateTime is:2019-11-11 10:00"
    }
}
package com.morayl.samples

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotBeNull
import org.amshove.kluent.shouldNotEqual
import org.junit.Test

class BasicSample {

    @Test
    fun basic_expression() {
        2 + 2 shouldEqual 4
        2 + 2 shouldNotEqual 5
        false shouldBe false
    }

    @Test
    fun null_or_notNull() {
        val textNotNull = "test"
        textNotNull shouldEqual "test"
        // check not null
        textNotNull.shouldNotBeNull()

        val textNull: String? = null
        textNull shouldEqual null
        // or
        textNull.shouldBeNull()
    }

    @Test
    fun staticUtils() {
        KotlinDateTimeUtils.getFormat() shouldEqual "yyyymmdd HH:mm"
    }
}

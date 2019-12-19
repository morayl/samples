package com.morayl.samples.ext

import io.reactivex.observers.BaseTestConsumer

fun <T, U : BaseTestConsumer<T, U>> BaseTestConsumer<T, U>.assertValueWith(verification: (T) -> Unit): U {
    return assertValue {
        try {
            verification(it)
            return@assertValue true
        } catch (e: AssertionError) {
            e.printStackTrace()
            return@assertValue false
        }
    }
}

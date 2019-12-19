package com.morayl.samples.ext

import io.reactivex.Single
import java.util.concurrent.TimeUnit

fun <T> Single<T>.testAssertValueWith(verification: (T) -> Unit) {
    test().awaitDone(5, TimeUnit.SECONDS).assertNoErrors()
        .assertValueWith(verification)
}
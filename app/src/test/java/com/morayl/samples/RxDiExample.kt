package com.morayl.samples

import com.morayl.samples.ext.testAssertValueWith
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import org.amshove.kluent.mock
import org.amshove.kluent.shouldEqual
import org.junit.Test

class RxDiExample {

    private val repository: SampleRepository = mock()
    private val useCase = SampleUseCase(repository)

    /**
     * need kotlin extension[testAssertValueWith]
     */
    @Test
    fun fetchSample() {
        whenever(repository.fetchSample("key", 10))
                .thenReturn(Single.just(SampleResponse("name", 100, "value")))
        useCase.fetchSample("key", 10)
                .testAssertValueWith {
                    it.name shouldEqual "name"
                    it.number shouldEqual 100
                    it.value shouldEqual "value"
                }
    }
}
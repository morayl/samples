package com.morayl.samples

import io.reactivex.Single

interface SampleApi {
    fun fetchSample(key: String, limit: Int): Single<SampleResponse>
}
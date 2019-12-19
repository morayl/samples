package com.morayl.samples

import io.reactivex.Single

class SampleRepository(private val api: SampleApi) {
    fun fetchSample(key: String, limit: Int): Single<SampleResponse> {
        return api.fetchSample(key, limit)
    }
}
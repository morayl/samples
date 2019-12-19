package com.morayl.samples

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class SampleUseCase(private val repository: SampleRepository) {
    fun fetchSample(key: String, limit: Int): Single<SampleResponse> {
        return repository.fetchSample(key, limit)
            .subscribeOn(Schedulers.io())
    }
}
package com.example.hurbalpha.webservice

import com.example.hurbalpha.webservice.model.SearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search/api")
    fun search(
        @Query("q") query: String,
        @Query("page") page: Int
    ): Single<SearchResponse>
}
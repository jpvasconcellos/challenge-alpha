package com.example.hurbalpha.webservice

import com.example.hurbalpha.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    val service: ApiService = Retrofit.Builder()
        .baseUrl(BuildConfig.API_URL)
        .client(httpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiService::class.java)

    private fun httpClient(): OkHttpClient {
        with(OkHttpClient.Builder()) {
            if (BuildConfig.DEBUG) {
                val logging = HttpLoggingInterceptor()
                logging.level = HttpLoggingInterceptor.Level.BODY
                addInterceptor(logging)
            }

            return this.build()
        }
    }
}
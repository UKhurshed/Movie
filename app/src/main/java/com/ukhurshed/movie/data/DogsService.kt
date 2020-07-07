package com.ukhurshed.movie.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

//interface DogsService {
//
//    @GET("image/random")
//    fun getDogs(): Call<List<DogsResponse>>
//}

private const val API_KEY = "e6c2896a-e697-4fcb-b624-98820a5504e8"

interface DogsService {

    @GET("images/search")
    fun getCats(
        @Header("x-api-key") apiKey: String = API_KEY
    ): Call<List<DogsResponse>>
}
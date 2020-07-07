package com.ukhurshed.movie.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//@JsonClass(generateAdapter = true)
//data class DogsResponse(
//    @Json(name = "message")
//    val message: String,
//
//    @Json(name = "status")
//    val status: String
//)

@JsonClass(generateAdapter = true)
class DogsResponse(
    @Json(name = "id")
    val id: String,

    @Json(name = "url")
    val url: String,

    @Json(name = "width")
    val width: Int,

    @Json(name = "height")
    val height: Int
)
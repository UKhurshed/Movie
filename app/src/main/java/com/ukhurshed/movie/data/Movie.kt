package com.ukhurshed.movie.data

import androidx.annotation.DrawableRes

data class Movie(
    @DrawableRes val img_end: Int,
    @DrawableRes val img_back: Int,
    val main_text: Int,
    val released_text: Int,
    val overview: Int,
    val some_text: Int,
    val trailer_url: String
)
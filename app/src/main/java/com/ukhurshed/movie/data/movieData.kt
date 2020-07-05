package com.ukhurshed.movie.data

import com.ukhurshed.movie.R

object movieData{

    fun getMovieData() : List<mainMovieData>{
        return listOf(
            mainMovieData(R.drawable.endgame_image,
            R.string.infinity_war,
            R.string.infinity_whole_text),

            mainMovieData(R.drawable.captain_marvel,
                R.string.infinity_war,
                R.string.infinity_whole_text),

            mainMovieData(R.drawable.war_post,
                R.string.infinity_war,
                R.string.infinity_whole_text),

            mainMovieData(R.drawable.thor_original,
                R.string.infinity_war,
                R.string.infinity_whole_text),

            mainMovieData(R.drawable.guardians_galaxy,
                R.string.infinity_war,
                R.string.infinity_whole_text),

            mainMovieData(R.drawable.captain_america_civil_war,
                R.string.infinity_war,
                R.string.infinity_whole_text)
        )
    }
}
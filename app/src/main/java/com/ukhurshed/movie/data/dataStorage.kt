package com.ukhurshed.movie.data

import com.ukhurshed.movie.R

object dataStorage{

    fun getMovieList(): List<Movie>{
        return listOf(
            Movie(R.drawable.endgame_image,
                  R.drawable.endgame_background,
                  R.string.endgame,
                  R.string.released_text,
                  R.string.overview,
                  R.string.last_text,
                "https://www.youtube.com/watch?v=gbcVZgO4n4E"),

            Movie(R.drawable.captain_marvel,
            R.drawable.captain_back,
            R.string.endgame,
            R.string.released_text,
            R.string.overview,
            R.string.last_text,
            "https://www.youtube.com/watch?v=2eaZUwBWJLM"),
            Movie(R.drawable.war_post,
                R.drawable.back_war,
                R.string.endgame,
                R.string.released_text,
                R.string.overview,
                R.string.last_text,
                "https://www.youtube.com/watch?v=UsnDPok1ZOU"),
            Movie(R.drawable.black_pantera,
                R.drawable.back_pantera,
                R.string.endgame,
                R.string.released_text,
                R.string.overview,
                R.string.last_text,
                "https://www.youtube.com/watch?v=qGpejFwCZS0"),
            Movie(R.drawable.thor_original,
                R.drawable.thor_back,
                R.string.endgame,
                R.string.released_text,
                R.string.overview,
                R.string.last_text,
                "https://www.youtube.com/watch?v=KoI61d_ol1Y"),
            Movie(R.drawable.guardians_galaxy,
                R.drawable.galaxy_back,
                R.string.endgame,
                R.string.released_text,
                R.string.overview,
                R.string.last_text,
                "https://www.youtube.com/watch?v=Ys3mXt3WqMA"),
            Movie(R.drawable.first_back,
                R.drawable.thor_back,
                R.string.endgame,
                R.string.released_text,
                R.string.overview,
                R.string.last_text,
                "https://www.youtube.com/watch?v=AaEH4AgPb2A")
        )
    }
}
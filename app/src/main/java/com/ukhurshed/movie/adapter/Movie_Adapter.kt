package com.ukhurshed.movie.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ukhurshed.movie.R
import com.ukhurshed.movie.data.mainMovieData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Movie_Adapter  : RecyclerView.Adapter<Movie_Adapter.ViewHolder>(){

    private val contextIntent: Context? = null
    private var movies: List<mainMovieData> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Movie_Adapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_item_movie, parent, false))
    }

    override fun getItemCount(): Int = movies.size

    fun submitList(movieList: List<mainMovieData>){
        movies = movieList
    }

    private fun getItem(position: Int) = movies[position]

    override fun onBindViewHolder(holder: Movie_Adapter.ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun onReceive(intent: Intent){
        contextIntent?.startActivity(intent)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val RESULT_1 = "Result #1"

        private val avatar: ImageView = itemView.findViewById(R.id.avatar)
        private var title_txt: TextView = itemView.findViewById(R.id.title)
        private val description: TextView = itemView.findViewById(R.id.description)



        fun bind(movie: mainMovieData){
            avatar.setImageResource(movie.avatar_img)
            title_txt.setText(movie.title_txt)
            description.setText(movie.description)

//            click.setOnClickListener {
//                CoroutineScope(Dispatchers.IO).launch{
//                    fakeApi()
//                }
//            }
        }
        private suspend fun fakeApi(){
            val result1 = getResultFromApi()
            println("debug: $result1")
        }

        private suspend fun getResultFromApi(): String{
            logThread("getResultFromApi")
            delay(2000)
            return RESULT_1
        }

        private fun logThread(str: String){
            println("debug: ${str}, ${Thread.currentThread().name}")
        }
    }



}

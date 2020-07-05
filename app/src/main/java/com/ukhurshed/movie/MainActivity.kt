package com.ukhurshed.movie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ukhurshed.movie.adapter.Movie_Adapter
import com.ukhurshed.movie.data.movieData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var itemAdapter = Movie_Adapter()
        movie_list.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val itemData = movieData.getMovieData()
            itemAdapter.submitList(itemData)
            adapter = itemAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_recycler, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.coroutine_id -> {
                val intent = Intent(this, MultithreadingActivity::class.java)
                val coroutine = "Coro"
                intent.putExtra(MultithreadingActivity.COROUTINE_TXT, coroutine)
                startActivity(intent)
                true
            }
            R.id.thread_id -> {
                val intent = Intent(this, MultithreadingActivity::class.java)
                val handler = "Handler"
                intent.putExtra(MultithreadingActivity.HANDLER_TXT, handler)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}

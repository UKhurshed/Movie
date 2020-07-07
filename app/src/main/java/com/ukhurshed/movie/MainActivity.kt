package com.ukhurshed.movie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.ukhurshed.movie.Adapters.DogsAdapter
import com.ukhurshed.movie.data.DogsResponse
import com.ukhurshed.movie.data.NetworkModule
import kotlinx.android.synthetic.main.dogs_recyclerview.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var theDogApiService = NetworkModule.dogsService

    private lateinit var swipeRefresh: SwipeRefreshLayout
    private lateinit var dogsAdapter: DogsAdapter
    private lateinit var dogsRv: RecyclerView

    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dogsRv = findViewById(R.id.dogs_recyclerview)
        dogsRv.setHasFixedSize(true)
        swipeRefresh = findViewById(R.id.swipeRefresh)

        dogsAdapter = DogsAdapter()
        dogsRv.adapter = dogsAdapter

        progressBar = findViewById(R.id.loading)
    }

    override fun onResume() {
        super.onResume()

        repeat(10){
            progressBar.isVisible = true
            val dogsCall: Call<List<DogsResponse>> = theDogApiService.getCats()
            dogsCall.enqueue(object: Callback<List<DogsResponse>>{

                override fun onFailure(call: Call<List<DogsResponse>>, t: Throwable) {
                    progressBar.isVisible = false
                    Toast.makeText(this@MainActivity, "Error call", Toast.LENGTH_LONG).show()
                }

                override fun onResponse(
                    call: Call<List<DogsResponse>>,
                    response: Response<List<DogsResponse>>) {
                    val dogs: List<DogsResponse> = response.body() ?: emptyList()
                    progressBar.isVisible = false
                    dogsAdapter.addDogs(dogs)
                }
            })
        }

        swipeRefresh.setOnRefreshListener {
            dogsAdapter.clearDogs()
            repeat(10){
                swipeRefresh.isRefreshing  = true
                val dogsCalls: Call<List<DogsResponse>> = theDogApiService.getCats()
                dogsCalls.enqueue(object: Callback<List<DogsResponse>>{

                    override fun onFailure(call: Call<List<DogsResponse>>, t: Throwable) {
                        swipeRefresh.isRefreshing = false
                        Toast.makeText(this@MainActivity, "Loading Error", Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(
                        call: Call<List<DogsResponse>>,
                        response: Response<List<DogsResponse>>) {
                        val dogs: List<DogsResponse> = response.body() ?: emptyList()
                        swipeRefresh.isRefreshing = false
                        dogsAdapter.addDogs(dogs)
                    }
                })
            }
        }


    }
}

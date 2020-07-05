package com.ukhurshed.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MultithreadingActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private val mainFragment = Coroutine()

    private val fragmentMng = supportFragmentManager
    private val handlerFragment = Handler()

    private val coroutine_frame = R.id.coro_fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multithreading)


        var intent = Intent()
        val msg_txt = intent.getStringExtra(COROUTINE_TXT)
        if (msg_txt == COROUTINE_TXT) {
            val fragmentManager = fragmentManager.beginTransaction()
                .add(R.id.coro_fragment, mainFragment)
                .commit()

        }

        else if (msg_txt == HANDLER_TXT){
            val fragmentManager = fragmentMng.beginTransaction()
                .add(R.id.handler_fragment,handlerFragment)
                .commit()
        }
    }

    companion object{
        val COROUTINE_TXT: String = "Coro"
        val HANDLER_TXT: String = "Handler"
    }
}

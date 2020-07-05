package com.ukhurshed.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Coroutine: Fragment() {

    companion object{
        fun instance(): Coroutine{
            return Coroutine()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.coroutine, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val starClick: Button = view.findViewById(R.id.start)
//        val cancelClick: Button = view.findViewById(R.id.cancel)
//        val createClick: Button = view.findViewById(R.id.create)

    }
}
package com.ukhurshed.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainFragment: Fragment() {

    companion object{
        fun instance(): MainFragment{
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dog_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val labelText: TextView = view.findViewById(R.id.text_dog)
        val imageDog: ImageView = view.findViewById(R.id.image_dog)
        val mainText: TextView = view.findViewById(R.id.main_text)

        val requestOptions = RequestOptions().error(R.drawable.ic_launcher_foreground)

        context?.let { Glide.with(it).applyDefaultRequestOptions(requestOptions)
            .load("https://i.pinimg.com/originals/f5/f7/f2/f5f7f2b5504b10314f5b066084617a5f.jpg")
            .into(imageDog) }


    }
}
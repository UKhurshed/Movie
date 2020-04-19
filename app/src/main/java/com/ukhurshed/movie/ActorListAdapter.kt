package com.ukhurshed.movie

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActorListAdapter: RecyclerView.Adapter<ActorListAdapter.ViewHolder>(){

    private var actor: List<Actor> = ArrayList()

    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false))
    }

    override fun getItemCount(): Int = actor.size

    fun submitList(ActorList: List<Actor>){
        actor = ActorList
    }

    fun getItem(position: Int) = actor[position]

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

     class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         private val avatar: ImageView = itemView.findViewById(R.id.avatar)
         private val name: TextView = itemView.findViewById(R.id.name)
         private val oscar: ImageView = itemView.findViewById(R.id.oscar)

         fun bind(actor: Actor){
             name.text = actor.name

             val requestOptions = RequestOptions()
                 .placeholder(R.drawable.ic_launcher_background)
                 .error(R.drawable.ic_launcher_foreground)

             Glide.with(itemView.context)
                 .applyDefaultRequestOptions(requestOptions)
                 .load(actor.avatar)
                 .into(avatar)

             oscar.visibility = if(actor.hasOscar) View.VISIBLE else View.GONE
         }

    }
}
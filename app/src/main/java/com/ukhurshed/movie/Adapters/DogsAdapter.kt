package com.ukhurshed.movie.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.ukhurshed.movie.Adapters.DogsAdapter.DogViewHolder
import com.ukhurshed.movie.R
import com.ukhurshed.movie.data.DogsResponse

class DogsAdapter: RecyclerView.Adapter<DogViewHolder>() {

    private val dogs: MutableList<DogsResponse> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.dogs_recyclerview, parent, false)
        return DogViewHolder(itemView)
    }

    override fun getItemCount() = dogs.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.bind(dog = dogs[position], position = position)
    }

    fun addDogs(newDogs: List<DogsResponse>){
        dogs+= newDogs
        notifyDataSetChanged()
    }

    fun submitList(newDogs: List<DogsResponse>){
        dogs.clear()
        dogs+=newDogs
        notifyDataSetChanged()
    }

    fun clearDogs(){
        dogs.clear()
        notifyDataSetChanged()
    }

     class DogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

         private val label: TextView = itemView.findViewById(R.id.label)
         private val imgDog: ImageView = itemView.findViewById(R.id.dogs)

        fun bind(dog: DogsResponse, position: Int){
            label.text = "Dog ${position}"
            imgDog.load(dog.url){
                crossfade(true)
                placeholder(R.mipmap.ic_launcher)
            }

        }

    }
}
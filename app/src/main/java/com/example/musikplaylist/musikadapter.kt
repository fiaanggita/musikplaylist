package com.example.musikplaylist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.musikplaylist.musikadapter.ListViewHolder
import com.example.playlistmusik.musikmodel

class musikadapter (private val listmusik:ArrayList<musikmodel>) :
    RecyclerView.Adapter<musikadapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ListViewHolder{
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.tampilanpertama, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val musik = listmusik[position]

        Glide.with(holder.itemView.context)
            .load(musik.img)
            .apply(RequestOptions().override(55,55))
            .into((holder.tvImg))

        holder.tvJudul.text = musik.judul
        holder.tvDesc.text = musik.desc

        val moveDetail = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveToDetail = Intent(moveDetail, DetailActivity::class.java)

            moveToDetail.putExtra(DetailActivity.ARTIS, musik.artis)
            moveToDetail.putExtra(DetailActivity.JUDUL, musik.judul)
            moveToDetail.putExtra(DetailActivity.TAHUN, musik.tahun)
            moveToDetail.putExtra(DetailActivity.DESC, musik.desc)

            moveDetail.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listmusik.size
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvJudul: TextView = itemView.findViewById(R.id.title)
        var tvDesc: TextView = itemView.findViewById(R.id.desc)
        var tvImg: ImageView = itemView.findViewById(R.id.musik_img)
    }
}


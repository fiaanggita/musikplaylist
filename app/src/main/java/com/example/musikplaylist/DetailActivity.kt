package com.example.musikplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    companion object {
        const val ARTIS = "detailArtis"
        const val JUDUL = "detailJudul"
        const val DESC = "detailDesc"
        const val TAHUN = "detailTahun"
        const val IMG = "detailImg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val artis: TextView = findViewById(R.id.detailArtis)
        val desc: TextView = findViewById(R.id.detailDetail)
        val tahun: TextView = findViewById(R.id.detailTahun)
        val img: ImageView = findViewById(R.id.detailImg)

        val dArtis = intent.getStringExtra(ARTIS)
        val dDesc = intent.getStringExtra(DESC)
        val dImg = intent.getIntExtra(IMG, 0)
        val dTahun = intent.getIntExtra(TAHUN, 0)

        artis.text = dArtis
        desc.text = dDesc
        tahun.text = dTahun.toString()

        img.setImageResource(dImg)
    }
}
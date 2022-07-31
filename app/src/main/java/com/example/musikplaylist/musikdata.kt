package com.example.musikplaylist

import com.example.playlistmusik.musikmodel

object musikdata {
    private val id = intArrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
    )
    private val artis = arrayOf(
        "Fourtwnty",
        "Feby Putri",
        "Tulus",
        "Sezairi",
        "Pamungkas",
        "Lutfhi Aulia",
        "Juicy Lucky",
        "Lutfhi Aula & Feby Putri",
        "Fabio",
        "Kahitna"
    )
    private val judul = arrayOf(
        "Kusut",
        "Runtuh",
        "Interaksi",
        "Its You",
        "To The Bone",
        "Langit Favorite",
        "Lantas",
        "Naradira",
        "Rumah Singgah",
        "Cantik"
    )
    private val tahun = intArrayOf(
        2020,
        2021,
        2022,
        2020,
        2020,
        2021,
        2020,
        2020,
        2020,
        2020,
    )
    private val desc = arrayOf(
        "salah satu lagu dari Fourtwnty",
        "salah satu lagu dari Feby Putri yang sedang tren",
        "Interaksi merupakan lagu yang dirilis oleh Tulus dan sedang naik daun",
        "Its You tren pada tahun 2020",
        "To The Bone lagu dari Pamungkas",
        "Langit Favorit dinyanyikan oleh Lutfhi Aulia",
        "Lantas, lagu yang sedang naik daun",
        "Naradira sedang naik daun yang dinyanyikan oleh Feby Putri dan Lutfhi Aula",
        "Rumah Singgah sedang naik daun",
        "Cantik dibawakan oleh kahitna"
    )

    private val img = intArrayOf(
        R.drawable.fourtwnty,
        R.drawable.feby,
        R.drawable.tulus,
        R.drawable.sezairi,
        R.drawable.pamungkas,
        R.drawable.lutfhi,
        R.drawable.juicy,
        R.drawable.febylutf,
        R.drawable.fabio,
        R.drawable.kahitna
    )

    val listData: ArrayList<musikmodel>
    get(){
        val list = arrayListOf<musikmodel>()
        for (position in id.indices){
            val musik = musikmodel()
            musik.id = id[position]
            musik.artis = artis[position]
            musik.judul = judul[position]
            musik.tahun = tahun[position]
            musik.desc = desc[position]
            musik.img = img[position]

            list.add(musik)
        }
        return list
    }
}
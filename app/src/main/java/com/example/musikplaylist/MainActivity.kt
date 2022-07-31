package com.example.musikplaylist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.playlistmusik.musikmodel

class MainActivity : AppCompatActivity() {
    private lateinit var rvmusik: RecyclerView
    private var list: ArrayList<musikmodel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvmusik = findViewById(R.id.item_list)
        rvmusik.setHasFixedSize(true)

        list.addAll(musikdata.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvmusik.layoutManager = LinearLayoutManager(this)
        val musikadapter = musikadapter(list)
        rvmusik.adapter = musikadapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedModel: Int) {
        when(selectedModel) {
            R.id.about_menu -> {
                val about = Intent(this@MainActivity,
                    AboutActivity::class.java)
                startActivity(about)
            }
        }
    }


}
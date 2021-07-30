package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewAdapter.OnPlayerClickLister {
    lateinit var contact: List<Player>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contact = listOf(
            Player("Lionel Messi", R.drawable.goat, "(650) 555-1367", "lionelmessi@gmail.com"),
            Player("Pierre-Emerick Aubameyang", R.drawable.auba, "(650) 445-1897", "aubameyang@gmail.com"),
            Player("Robert Lewadowski", R.drawable.lewa, "(330) 888-1367", "lewandowski@gmail.com"),
            Player("Kylian Mbappe", R.drawable.mbappe,"(650) 544-0007", "kmbappe@gmail.com"),
            Player("Thomas Partey", R.drawable.partey, "(777) 555-2267", "thomasp@gmail.com"),
            Player("Nicolas Pepe", R.drawable.pepe, "(651) 552-1367", "n_pepe@gmail.com"),
            Player("Bukayo Saka", R.drawable.saka, "(+234) 8094156896", "saka.b@gmail.com"),
            Player("Smith Rowe", R.drawable.smith, "(650) 555-0007", "smith-rowe@gmail.com")
        )

        val recAdapter = RecyclerViewAdapter(this, contact, this)
        recView.adapter = recAdapter
        val layoutManager = LinearLayoutManager(this)
        recView.layoutManager = layoutManager


    }

    override fun onPlayerClick(position: Int) {
        contact[position]
        var intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("selected_contact", contact[position])
        startActivity(intent)
    }
}
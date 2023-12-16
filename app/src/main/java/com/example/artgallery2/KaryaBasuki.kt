package com.example.artgallery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class KaryaBasuki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karya_basuki)

        val biobasuki = findViewById<ImageView>(R.id.imagebiobasuki)
        val Karyadewi= findViewById<ImageButton>(R.id.Imagedewi)
        val Karyakuda = findViewById<ImageButton>(R.id.Imagekuda)
        val Karyadiponegoro = findViewById<ImageButton>(R.id.Imagediponegoro)
        val Karyapresiden = findViewById<ImageButton>(R.id.Imagepresiden)

        biobasuki.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, BiografiBasuki::class.java)
            startActivity(intent)
        })

        Karyadewi.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaPotretDewi::class.java)
            startActivity(intent)
        })

        Karyakuda.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaKuda::class.java)
            startActivity(intent)
        })

        Karyadiponegoro.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaDiponegoro::class.java)
            startActivity(intent)
        })

        Karyapresiden.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaPresiden::class.java)
            startActivity(intent)
        })
    }
}
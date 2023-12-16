package com.example.artgallery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class KaryaAffandi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.karya_affandi)

        val bioaffandi = findViewById<ImageView>(R.id.imagebioaffandi)
        val Karyaibuku= findViewById<ImageButton>(R.id.Imageibu)
        val KaryaAyam = findViewById<ImageButton>(R.id.Imageayam)
        val Karyacengkeh = findViewById<ImageButton>(R.id.Imagecengkeh)
        val Karyamatahari = findViewById<ImageButton>(R.id.Imagematahari)

        bioaffandi.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, BiografiAffandi::class.java)
            startActivity(intent)
        })

        Karyaibuku.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaIbuku::class.java)
            startActivity(intent)
        })

        KaryaAyam.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaAyamTarung::class.java)
            startActivity(intent)
        })

        Karyacengkeh.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaKebunCengkeh::class.java)
            startActivity(intent)
        })

        Karyamatahari.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaPerahuMatahari::class.java)
            startActivity(intent)
        })
    }
}
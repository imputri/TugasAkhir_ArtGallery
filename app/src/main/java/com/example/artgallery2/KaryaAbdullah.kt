package com.example.artgallery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import com.example.artgallery2.R.id.biografiabdullah

class KaryaAbdullah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.karya_abdullah)

        val bioabdullah = findViewById<ImageView>(R.id.imagebioabdullah)
        val KaryaPemandanganJaTeng = findViewById<ImageButton>(R.id.ImageJateng)
        val KaryaMerapi = findViewById<ImageButton>(R.id.ImageMerapi)
        val KaryaScenery = findViewById<ImageButton>(R.id.ImageScnery)
        val Karyagunung = findViewById<ImageButton>(R.id.ImageGunung)
        val Karyasawah = findViewById<ImageButton>(R.id.ImageSawah)

        bioabdullah.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, BiografiAbdullah::class.java)
            startActivity(intent)
        })

        KaryaPemandanganJaTeng.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaJateng::class.java)
            startActivity(intent)
        })

        KaryaMerapi.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaMerapi2::class.java)
            startActivity(intent)
        })

        KaryaScenery.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaScenery2::class.java)
            startActivity(intent)
        })

        Karyagunung.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaGunung::class.java)
            startActivity(intent)
        })

        Karyasawah.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaHamparan::class.java)
            startActivity(intent)
        })

    }
}
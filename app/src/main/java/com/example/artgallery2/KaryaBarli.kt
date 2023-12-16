package com.example.artgallery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class KaryaBarli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karya_barli)

        val biobarli = findViewById<ImageView>(R.id.imagebiobarli)
        val Karyamengaso= findViewById<ImageButton>(R.id.Imagemengaso)
        val Karyagadis = findViewById<ImageButton>(R.id.Imagegadisbali)
        val Karyapasar = findViewById<ImageButton>(R.id.Imagepasar)
        val Karyahilir = findViewById<ImageButton>(R.id.Imagehilir)

        biobarli.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, BiografiBarli::class.java)
            startActivity(intent)
        })

        Karyamengaso.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaMengaso::class.java)
            startActivity(intent)
        })

        Karyagadis.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaGadis::class.java)
            startActivity(intent)
        })

        Karyapasar.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaPasar::class.java)
            startActivity(intent)
        })

        Karyahilir.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaHilir::class.java)
            startActivity(intent)
        })
    }
}
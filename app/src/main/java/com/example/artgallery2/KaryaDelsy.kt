package com.example.artgallery2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class KaryaDelsy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karya_delsy)

        val biodelsy = findViewById<ImageView>(R.id.imagebiodelsy)
        val berburu= findViewById<ImageButton>(R.id.Imageberburu)
        val putrihijau = findViewById<ImageButton>(R.id.Imageputri)

        biodelsy.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, BiografiDelsy::class.java)
            startActivity(intent)
        })

        berburu.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaBerburu::class.java)
            startActivity(intent)
        })

        putrihijau.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaPutriHijau::class.java)
            startActivity(intent)
        })
    }
}
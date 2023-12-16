package com.example.artgallery2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class SenimanActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seniman)

        val SenimanAbdullah = findViewById<ImageButton>(R.id.SenimanAbdullah)
        val SenimanAffandi = findViewById<ImageButton>(R.id.SenimanAffandi)
        val SenimanBarli = findViewById<ImageButton>(R.id.SenimanBarli)
        val SenimanBasuki = findViewById<ImageButton>(R.id.SenimanBasuki)
        val SenimanDelsy = findViewById<ImageButton>(R.id.SenimanDelsy)

        SenimanAbdullah.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaAbdullah::class.java)
            startActivity(intent)
        })
        SenimanAffandi.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaAffandi::class.java)
            startActivity(intent)
        })
        SenimanBarli.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaBarli::class.java)
            startActivity(intent)
        })
        SenimanBasuki.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaBasuki::class.java)
            startActivity(intent)
        })
        SenimanDelsy.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, KaryaDelsy::class.java)
            startActivity(intent)
        })

    }
}
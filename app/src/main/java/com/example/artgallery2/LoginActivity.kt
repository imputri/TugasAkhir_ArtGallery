package com.example.artgallery2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Handle "Daftar" click
        val txt_btn1 = findViewById(R.id.btn_login) as TextView
        txt_btn1.setOnClickListener {
            // Pindah ke halaman registrasi
            startActivity(Intent(this, SenimanActivity::class.java))
            // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
            finish();
        }

        val txt_btn2 = findViewById(R.id.txt_register ) as TextView
        txt_btn2.setOnClickListener {
            // Pindah ke halaman registrasi
            startActivity(Intent(this, RegisterActivity::class.java))
            // Selesaikan aktivitas saat ini agar tidak bisa kembali lagi
            finish();
        }
    }
}
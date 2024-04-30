package com.example.tugasnovahertantiminggu10

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        // Mengakses elemen UI dari layout menggunakan findViewById dengan menyertakan package name
        val textView: TextView = findViewById(com.example.tugasnovahertantiminggu10.R.id.textView)
        val imageView: ImageView = findViewById(com.example.tugasnovahertantiminggu10.R.id.imageView5)
        val textView2: TextView = findViewById(com.example.tugasnovahertantiminggu10.R.id.textView2)
        val button: Button = findViewById(com.example.tugasnovahertantiminggu10.R.id.button)
        val button2: Button = findViewById(com.example.tugasnovahertantiminggu10.R.id.button2)
        val button3: Button = findViewById(com.example.tugasnovahertantiminggu10.R.id.button3)
        val button4: Button = findViewById(com.example.tugasnovahertantiminggu10.R.id.button4)

        // Mengatur teks untuk TextView dan Button
        textView.text = "Profile"
        textView2.text = "Nova Hertanti"

        // Menghapus gambar yang sebelumnya diatur atau menampilkan placeholder
        // Mengatur gambar menjadi null untuk menampilkan ImageView kosong
        imageView.setImageDrawable(null)

        // Menambahkan onClickListener ke Button
        button.setOnClickListener {
            // Logika untuk tombol "Edit Profile!"
            // Contoh: buka aktivitas pengeditan profil
        }

        button2.setOnClickListener {
            // Logika untuk tombol "Keamanan dan Akun"
            // Contoh: buka aktivitas keamanan dan akun
        }

        button3.setOnClickListener {
            // Logika untuk tombol "Pengaturan"
            // Contoh: buka aktivitas pengaturan aplikasi
        }

        button4.setOnClickListener {
            // Logika untuk tombol "Keluar"
            // Contoh: keluar dari aplikasi atau tampilkan dialog konfirmasi keluar
        }
    }
}

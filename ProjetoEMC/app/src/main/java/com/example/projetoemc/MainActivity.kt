package com.example.projetoemc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Certifique-se de que o layout correto está sendo usado

        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        btnIniciar.setOnClickListener {
            // Intent para abrir a nova atividade
            val intent = Intent(this, segunda_pagina::class.java)
            startActivity(intent)
        }
    }
}
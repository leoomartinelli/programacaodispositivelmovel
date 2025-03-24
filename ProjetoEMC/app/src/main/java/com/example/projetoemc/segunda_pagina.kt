package com.example.projetoemc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class segunda_pagina : AppCompatActivity() {
    var aux = 1  // Variável global para manter a contagem dos cálculos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_pagina)

        val lblFinal = findViewById<TextView>(R.id.lblFinal)
        val lblimc = findViewById<TextView>(R.id.lblimc)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val peso = findViewById<EditText>(R.id.Peso)
        val altura = findViewById<EditText>(R.id.Altura)
        val btnLimpar = findViewById<Button>(R.id.btnLimpar)

        btnCalcular.setOnClickListener {
            val Peso = peso.text.toString().toDoubleOrNull()
            val Altura = altura.text.toString().toDoubleOrNull()

            if (Peso != null && Peso > 20.0 && Peso < 400.0 && Altura != null && Altura > 0.5 && Altura < 2.5) {
                val imc = Peso / (Altura * Altura)
                lblimc.text = "IMC: %.2f".format(imc)

                if (imc < 16) {
                    lblFinal.text = "Magreza grau III"
                }
                if (imc >= 16 && imc < 16.9) {
                    lblFinal.text = "Magreza grau II"
                }
                if (imc >= 17 && imc < 18.4) {
                    lblFinal.text = "Magreza grau I"
                }
                if (imc >= 18.5 && imc < 24.9) {
                    lblFinal.text = "Eutrofia(normal)"
                }
                if (imc >= 25 && imc < 29.9) {
                    lblFinal.text = "Pré-obesidade"
                }
                if (imc >= 30 && imc < 34.9) {
                    lblFinal.text = "Obesidade moderada (grau I)"
                }
                if (imc >= 35 && imc < 39.9) {
                    lblFinal.text = "Obesidade severa(grau II)"
                }
                if (imc >= 40) {
                    lblFinal.text = "Obesidade muito severa(grau III)"
                }



            } else {
                lblimc.text = "Apresente valores válidos"
            }
        }

        btnLimpar.setOnClickListener {
            altura.text = null
            peso.text = null
            lblimc.text = "IMC: "
            lblFinal.text = ""
            Toast.makeText(this, "Limpado com Sucesso", Toast.LENGTH_SHORT).show()
        }
    }
}
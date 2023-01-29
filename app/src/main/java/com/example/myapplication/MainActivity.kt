package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.miboton) as Button

        btn.setOnClickListener {
            miDialogo()
        }

    }

    fun miDialogo() {

        val alertaDialogo = AlertDialog.Builder(this)

        alertaDialogo.apply {
            setIcon(R.drawable.bell)
            setTitle("Nube Colectiva")
            setMessage("Hola Crack de la Programacion !")
            setCancelable(false)
        }.create().show()

    }

}
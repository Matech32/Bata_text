package com.example.batatext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_libro.*

class LibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libro)

        val libros = intent.getSerializableExtra("Libro") as Libros

        nombre_libro.text = libros.nombre
        estado_libro.text = libros.estado
        descripcion_libro.text = libros.descripcion
        imagen_libro.setImageResource(R.drawable.comic)
    }
}
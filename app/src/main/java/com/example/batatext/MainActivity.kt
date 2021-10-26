package com.example.batatext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = Datos("Mateo Cruz", 18)

        val libro = Libros (datos,"Batman que rie", "Usado", "Comic de DC en excelente estado, cambio con uno de Marve", R.drawable.comic)
        val libro2 = Libros (datos,"Halo la caida de Reach", "Nuevo", "Libro de la saga de juegos Halo en perfecto estado, cambio por cualquier comic", R.drawable.comic2)

        val listaLibros = listOf(libro, libro2)

        val adapter = LibroAdapter (this, listaLibros)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, LibroActivity::class.java )
            intent.putExtra("libro", listaLibros[position])
            startActivity(intent)

        }
    }
}
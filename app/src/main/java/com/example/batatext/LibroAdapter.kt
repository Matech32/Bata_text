package com.example.batatext

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_libro.view.*

class LibroAdapter (private val mContext: Context, private val listaLibros: List<Libros>): ArrayAdapter<Libros>(mContext, 0, listaLibros) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_libro, parent, false)

        val libros = listaLibros[position]

        layout.nombre.text = libros.nombre
        layout.estado.text = libros.estado
        layout.imagen.setImageResource(libros.imagen)

        return layout

    }


}
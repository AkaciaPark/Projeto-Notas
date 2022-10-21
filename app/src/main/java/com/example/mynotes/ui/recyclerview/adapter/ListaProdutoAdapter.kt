package com.example.mynotes.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.model.Produto

class ListaProdutoAdapter (
    private val context: Context,
    private val produto:List<Produto>

        ): RecyclerView.Adapter<ListaProdutoAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nota1 = itemView.findViewById<TextView>(R.id.nota1)
            nota1.text = produto.nota1

            val nota2 = itemView.findViewById<TextView>(R.id.nota2)
            nota2.text = produto.nota2

            val nota3 = itemView.findViewById<TextView>(R.id.nota3)
            nota3.text = produto.nota3
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produto[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produto.size

}

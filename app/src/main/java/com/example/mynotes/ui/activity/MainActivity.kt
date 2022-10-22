package com.example.mynotes.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.model.Produto
import com.example.mynotes.ui.recyclerview.adapter.ListaProdutoAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val nota1 = findViewById<TextView>(R.id.nota1)
        //nota1.text = "está chovendo"
        //val nota2 = findViewById<TextView>(R.id.nota2)
        //nota2.text= "estou começando a ficar com fome"
        //val nota3 = findViewById<TextView>(R.id.nota3)
        //nota3.text =" quero comer pizza"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutoAdapter(context = this, produto = listOf(
            Produto(nota1 = "exemplo: lista de compras",
                nota2 = "viagens para 2023",
                nota3 = "pizzarias locais"
            ),
            Produto(nota1 = "lista de videos",
                nota2 = "exercicios do dia",
                nota3 = "não esquecer!"
            ),
        ))
       // recyclerView.layoutManager = LinearLayoutManager(this)

    }
}


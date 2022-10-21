package com.example.mynotes.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.model.Produto
import com.example.mynotes.ui.recyclerview.adapter.ListaProdutoAdapter

class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val nota1 = findViewById<TextView>(R.id.nota1)
        //nota1.text = "está chovendo"
        //val nota2 = findViewById<TextView>(R.id.nota2)
        //nota2.text= "estou começando a ficar com fome"
        //val nota3 = findViewById<TextView>(R.id.nota3)
        //nota3.text =" quero comer pizza"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutoAdapter(context = this, produto = listOf(
            Produto(nota1 = "ai que fome",
                nota2 = "roda pelamordedeus",
                nota3 = "puravô"
            ),
            Produto(nota1 = "ai que fomeeeeeeeeeeeeee",
                nota2 = "aaaaaaaaaaaaaaaaaaaaaaa",
                nota3 = "deu trabalho ein!"
            ),
        ))
       // recyclerView.layoutManager = LinearLayoutManager(this)

    }
}


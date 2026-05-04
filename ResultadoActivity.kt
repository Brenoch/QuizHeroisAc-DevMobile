package com.example.quizheroesac

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resposta1 = intent.getStringExtra("resp1")
        val resposta2 = intent.getStringExtra("resp2")
        val resposta3 = intent.getStringExtra("resp3")

        var batman = 0
        var aranha = 0
        var capitao = 0

        if (resposta1 == "Cidade a noite") {
            batman++
        } else if (resposta1 == "Bairro movimentado") {
            aranha++
        } else {
            capitao++
        }

        if (resposta2 == "Inteligencia") {
            batman++
        } else if (resposta2 == "Humor") {
            aranha++
        } else {
            capitao++
        }

        if (resposta3 == "Preto") {
            batman++
        } else if (resposta3 == "Vermelho") {
            aranha++
        } else {
            capitao++
        }

        var heroi = "🦇 Batman"
        if (aranha >= batman && aranha >= capitao) {
            heroi = "🕷️ Homem-Aranha"
        }
        if (capitao > batman && capitao > aranha) {
            heroi = "🛡️ Capitão América"
        }

        val texto = findViewById<TextView>(R.id.txtResultado)
        val imagem = findViewById<ImageView>(R.id.imgHeroi)
        texto.text = "Seu super heroi favorito e: $heroi"

        if (heroi == "🦇 Batman") {
            imagem.setImageResource(R.drawable.batman)
        } else if (heroi == "🕷️ Homem-Aranha") {
            imagem.setImageResource(R.drawable.aranha)
        } else {
            imagem.setImageResource(R.drawable.capitao)
        }
    }
}

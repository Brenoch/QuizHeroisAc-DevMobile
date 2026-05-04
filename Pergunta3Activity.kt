package com.example.quizheroesac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Pergunta3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta3)

        val grupo = findViewById<RadioGroup>(R.id.grupo3)
        val botao = findViewById<Button>(R.id.btnResultado)

        val resposta1 = intent.getStringExtra("resp1")
        val resposta2 = intent.getStringExtra("resp2")

        botao.setOnClickListener {
            val marcado = grupo.checkedRadioButtonId
            var resposta3 = "capitao"

            if (marcado != -1) {
                resposta3 = findViewById<RadioButton>(marcado).text.toString()
            }

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("resp1", resposta1)
            intent.putExtra("resp2", resposta2)
            intent.putExtra("resp3", resposta3)
            startActivity(intent)
        }
    }
}

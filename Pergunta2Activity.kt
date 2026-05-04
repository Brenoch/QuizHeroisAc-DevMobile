package com.example.quizheroesac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Pergunta2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta2)

        val grupo = findViewById<RadioGroup>(R.id.grupo2)
        val botao = findViewById<Button>(R.id.btnProxima2)

        val resposta1 = intent.getStringExtra("resp1")

        botao.setOnClickListener {
            val marcado = grupo.checkedRadioButtonId
            var resposta2 = "aranha"

            if (marcado != -1) {
                resposta2 = findViewById<RadioButton>(marcado).text.toString()
            }

            val intent = Intent(this, Pergunta3Activity::class.java)
            intent.putExtra("resp1", resposta1)
            intent.putExtra("resp2", resposta2)
            startActivity(intent)
        }
    }
}

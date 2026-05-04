package com.example.quizheroesac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grupo = findViewById<RadioGroup>(R.id.grupo1)
        val botao = findViewById<Button>(R.id.btnProxima1)

        botao.setOnClickListener {
            val marcado = grupo.checkedRadioButtonId
            val resposta = if (marcado != -1) {
                findViewById<RadioButton>(marcado).text.toString()
            } else {
                "batman"
            }

            val intent = Intent(this, Pergunta2Activity::class.java)
            intent.putExtra("resp1", resposta)
            startActivity(intent)
        }
    }
}

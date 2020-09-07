package com.example.teste

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ValidarVida(Componente: View) {
        val Nome = Nome_char.text
        val Vida = Hp_char.text.toString().toInt()
        val Dano = Dano_char.text.toString().toInt()

        if (Nome.length == 0) {
            Toast.makeText(this, "O campo não pode ficar vazio", Toast.LENGTH_SHORT).show()
        }

        else if (Vida < 10) {
            Toast.makeText(this, "Sua vida não pode ser menor que 10", Toast.LENGTH_SHORT).show()
        }

        else if (Dano < 0 || Dano > Vida) {
            Toast.makeText(this, "o valor é invalido", Toast.LENGTH_SHORT).show()
        }

        else {
            val Final = Vida - Dano
             if(Final > 0){  texto_resul.visibility = View.VISIBLE
                 texto_resul.setTextColor(Color.parseColor("#41EC48"))
                 texto_resul.text = " Parabéns seu personagem $Nome,esta vivo"}
            else {
                 texto_resul.visibility = View.VISIBLE
                 texto_resul.setTextColor(Color.parseColor("#F10606"))
                 texto_resul.text = " Infelizmente seu personagem $Nome,esta morto"}
             }
        }


      }

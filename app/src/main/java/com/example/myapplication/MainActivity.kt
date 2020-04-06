package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button11.setOnClickListener {
            Num("magazineluiza.com.br")
        }
        button12.setOnClickListener {
            Num("buscape.com.br")
        }
        button13.setOnClickListener {
            Num("ebay.com")
        }
        button14.setOnClickListener {
            Num("americanas.com.br")
        }
        button15.setOnClickListener {
            Num("submarino.com.br")
        }
        button16.setOnClickListener {
            Num("mercadolivre.com.br")
        }
        button17.setOnClickListener {
            Sobre()
        }
    }
        private fun Num(text: String){
            val intent = Intent(this, WebActivity::class.java)
            intent.putExtra("text", text)
            startActivity (intent)

        }
        private fun Sobre(){
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }


}





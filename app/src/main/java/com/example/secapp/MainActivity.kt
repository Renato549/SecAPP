package com.example.secapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytxtNombre = findViewById<EditText>(R.id.TextNombre)
        val mytxtEdad = findViewById<EditText>(R.id.TextEdad)
        val myButtonSubmit = findViewById<Button>(R.id.button)


        myButtonSubmit.setOnClickListener {
            var nombre : String = mytxtNombre.text.toString()
            var edad : Int = parseInt(mytxtEdad.text.toString())

            val myIntent = Intent(this, ActivityTarget::class.java)


            myIntent.putExtra("keyname", nombre)
            myIntent.putExtra("keyEdad", edad)


            startActivity(myIntent)
        }

        Log.d("E2", "Fin de la ejecucion de onCreate de MainActivity");

        override fun onStart(){
            Log.d("MYAPP","Fin de la ejecucion");
            super.onStart()
        }
        override fun onRestart() {
            Log.d("MYAPP","Fin de la ejecucion");
            super.onRestart()

        }
        override fun onResume() {
            Log.d("MYAPP","Fin de la ejecucion");
            super.onResume()

        }



    }
}
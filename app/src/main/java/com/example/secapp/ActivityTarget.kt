package com.example.secapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ActivityTarget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myTxtNombre = findViewById<TextView>(R.id.textView4)
        val myTxtEdad = findViewById<TextView>(R.id.textView6)
        val botonRegresar = findViewById<Button>(R.id.button2)

        var myExtras : Bundle? = intent.extras

        var nombreRecibido : String =  myExtras?.getString("keyname")?:"NoName"
        var EdadRecibido : Int =  myExtras?.getInt("keyEdad")?:-1

        myTxtNombre.text = nombreRecibido
        myTxtEdad.text = EdadRecibido.toString()


        botonRegresar.setOnClickListener {
            val myIntent : Intent = Intent(this,MainActivity::class.java)
        }

    }
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
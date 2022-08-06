package com.example.cronometro2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.Gravity
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    internal var detener: Long = 0
    internal var correr: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cronometro= findViewById<Chronometer>(R.id.chrono) as Chronometer
        val iniciar= findViewById<Button>(R.id.start) as Button
        val parar= findViewById<Button>(R.id.stop) as Button
        val repetir= findViewById<Button>(R.id.repeat) as Button

        iniciar.setOnClickListener {
            cronometro.base = SystemClock.elapsedRealtime()
            cronometro.start()
            val toast=Toast.makeText(this@MainActivity, "A Iniciado El Tiempo", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
        parar.setOnClickListener {
            cronometro.stop()
            val toast2=Toast.makeText(this@MainActivity, "Se Ha Detenido El Tiempo", Toast.LENGTH_SHORT)
            toast2.setGravity(Gravity.TOP,0,0)
            toast2.show()
        }
        repetir.setOnClickListener {
            cronometro.base = SystemClock.elapsedRealtime()
            detener = 0
            val toast3=Toast.makeText(this@MainActivity, "Se Ha Reiniciado El Tiempo", Toast.LENGTH_SHORT)
            toast3.setGravity(Gravity.TOP,0,0)
            toast3.show()
        }

    }
}

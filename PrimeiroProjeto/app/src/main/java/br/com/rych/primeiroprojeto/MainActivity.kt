package br.com.rych.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

lateinit var campoName: EditText
lateinit var buttonName: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoName = findViewById(R.id.nameTextId)
        buttonName = findViewById(R.id.buttonId)

        buttonName.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                var textoDigitado = campoName.text.toString()
                Toast.makeText(applicationContext, textoDigitado,Toast.LENGTH_LONG).show()
            }
        })

    }
}
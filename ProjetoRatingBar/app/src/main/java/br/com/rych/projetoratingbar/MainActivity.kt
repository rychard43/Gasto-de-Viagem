package br.com.rych.projetoratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {

    lateinit var texto: EditText
    lateinit var ratingBar: RatingBar
    lateinit var  button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorSelecionadoId)
        ratingBar = findViewById(R.id.ratingBarId)
        button = findViewById(R.id.buttonId)

        ratingBar.setOnRatingBarChangeListener()

    }
}
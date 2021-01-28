package br.com.rych.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)

        buttomCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttomCalculate) {
            calculate()
        }
    }

    private fun calculate() {

        if (validationOk()) {
           try {
               val distance = editDistance.text.toString().toFloat();
               val price = editPrice.text.toString().toFloat();
               val autonomy = editAutonomy.text.toString().toFloat();

               val totalValue = (distance * price) / autonomy

               textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"
           }catch (nfe : NumberFormatException){
               Toast.makeText(this, getString(R.string.informe_valores_validos), Toast.LENGTH_LONG).show()
           }
        }else{
            Toast.makeText(this, getString(R.string.preencha_todos_campos), Toast.LENGTH_LONG).show()
        }
    }

    private fun validationOk(): Boolean {
        return (editAutonomy.text.toString() != ""
                && editDistance.text.toString() != ""
                && editPrice.text.toString() != ""
                && editAutonomy.text.toString() != "0")

    }
}
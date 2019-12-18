package com.yehu.tresmonazos

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {

    var title = ""
    var info = ""
    var description = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

        ordenBtn.setOnClickListener { it: View? ->
            findViewById<TextView>(R.id.titleTxt).setText("Orden: ")
            findViewById<TextView>(R.id.infoTxt).setText("Paga 650 veces la inversión.")
            findViewById<TextView>(R.id.descriptionTxt).setText("Si acierta los 3 números en el mismo orden.")
            ordenBtn.visibility = View.GONE
            desordenBtn.visibility = View.GONE
            combo1Btn2.visibility = View.GONE
            combo2Btn.visibility = View.GONE
            infoTextLayout.visibility = View.VISIBLE
        }

        desordenBtn.setOnClickListener { it: View? ->
            findViewById<TextView>(R.id.titleTxt).setText("Orden: ")
            findViewById<TextView>(R.id.infoTxt).setText("Paga 100 veces la inversión.")
            findViewById<TextView>(R.id.descriptionTxt).setText("Si acierta los 3 números en orden o desorden.")
            ordenBtn.visibility = View.GONE
            desordenBtn.visibility = View.GONE
            combo1Btn2.visibility = View.GONE
            combo2Btn.visibility = View.GONE
            infoTextLayout.visibility = View.VISIBLE
        }

        combo1Btn2.setOnClickListener { it: View? ->
            findViewById<TextView>(R.id.titleTxt).setText("Combo Orden-Desorden: ")
            findViewById<TextView>(R.id.infoTxt).setText("Paga 500 veces la inversión (Mismo orden).")
            findViewById<TextView>(R.id.descriptionTxt).setText("Paga 25 veces la inversión (Diferente orden).")
            ordenBtn.visibility = View.GONE
            desordenBtn.visibility = View.GONE
            combo1Btn2.visibility = View.GONE
            combo2Btn.visibility = View.GONE
            infoTextLayout.visibility = View.VISIBLE
        }

        combo2Btn.setOnClickListener { it: View? ->
            findViewById<TextView>(R.id.titleTxt).setText("Combo Orden: Últimos dos dígitos")
            findViewById<TextView>(R.id.infoTxt).setText("Paga 500 veces la inversión (Mismo orden).")
            findViewById<TextView>(R.id.descriptionTxt).setText("Si acierta los últmos dos dígitos en el mismo orden gana 15 veces.")
            ordenBtn.visibility = View.GONE
            desordenBtn.visibility = View.GONE
            combo1Btn2.visibility = View.GONE
            combo2Btn.visibility = View.GONE
            infoTextLayout.visibility = View.VISIBLE
        }

        playBtn.setOnClickListener {
            val activityIntent = Intent(this, Numbers::class.java)
            startActivity(activityIntent)
        }
    }
}

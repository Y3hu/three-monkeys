package com.yehu.tresmonazos

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_numbers.*

class Numbers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

        luckyBtn.setOnClickListener {
            val activityIntent = Intent(this, Menu::class.java)
            startActivity(activityIntent)
        }
    }
}

package com.apps.nb2998.pals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_match_options.*

class MatchOptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_options)

        val btnFindFriends: Button = findViewById(R.id.btnFindFriends)
        val checkbox1: CheckBox = findViewById(R.id.checkbox1)
        val checkbox2: CheckBox = findViewById(R.id.checkbox2)
        val checkbox3: CheckBox = findViewById(R.id.checkbox3)

        btnFindFriends.setOnClickListener {
            if(checkbox1.isChecked) {

            }

            if(checkbox2.isChecked) {

            }

            if(checkbox3.isChecked) {

            }
        }
    }
}

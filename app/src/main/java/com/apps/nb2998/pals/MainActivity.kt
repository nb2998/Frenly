package com.apps.nb2998.pals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFriends.setOnClickListener(this)
        btnRecommendations.setOnClickListener(this)
        btnLookingForAFriend.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btnLookingForAFriend->{
                val intent = Intent(this@MainActivity, MatchOptionsActivity::class.java)
                startActivity(intent)

            }
            R.id.btnRecommendations->{
                val intent = Intent(this@MainActivity, RecommendationActivity::class.java)
                startActivity(intent)
            }
            R.id.btnFriends->{
                val intent = Intent(this@MainActivity, FriendsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

package com.apps.nb2998.pals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class FriendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        val recViewFriends: RecyclerView = findViewById(R.id.recViewFriends)
        val listFriends: ArrayList<User> = ArrayList()
        val adapter = FriendsAdapter(this@FriendsActivity, listFriends)

        recViewFriends.layoutManager = LinearLayoutManager(this@FriendsActivity)
        recViewFriends.adapter = adapter

        listFriends.add(User("Abha"))
        listFriends.add(User("Prerna"))
        listFriends.add(User("Akshay"))
        listFriends.add(User("Nishtha"))
        listFriends.add(User("Manav"))
        adapter.notifyDataSetChanged()
    }
}

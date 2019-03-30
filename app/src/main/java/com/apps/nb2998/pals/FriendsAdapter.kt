package com.apps.nb2998.pals

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FriendsAdapter(val ctx: Context, val listFriends: ArrayList<User>) :
    RecyclerView.Adapter<FriendsAdapter.FriendHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int) =
        FriendHolder(LayoutInflater.from(ctx).inflate(R.layout.single_row_friend, viewGroup, false))

    override fun getItemCount(): Int = listFriends.size

    override fun onBindViewHolder(holder: FriendHolder, position: Int) {
        holder.onBind(listFriends[position])
    }

    inner class FriendHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvNameFriend : TextView = view.findViewById(R.id.tvNameFriend)

        fun onBind(user: User) {
            tvNameFriend.text = user.name
            view.setOnClickListener {
                val intent = Intent(ctx, ChatActivity::class.java)
                ctx.startActivity(intent)
            }

        }
    }
}
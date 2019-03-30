package com.apps.nb2998.pals

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecomAdapter(val ctx: Context, val listOfRecom: ArrayList<Recommendation>) :
    RecyclerView.Adapter<RecomAdapter.RecomHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): RecomHolder = RecomHolder(
        LayoutInflater.from(ctx).inflate(
            R.layout.single_row_recom,
            viewGroup, false
        )
    )

    override fun getItemCount(): Int = listOfRecom.size

    override fun onBindViewHolder(holder: RecomHolder, position: Int) {
        holder.onBind(listOfRecom[position])
    }

    inner class RecomHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvGenre: TextView = view.findViewById(R.id.tvGenre)
        fun onBind(recom: Recommendation) {
            tvTitle.text = recom.title
            tvGenre.text = recom.genre
        }
    }
}
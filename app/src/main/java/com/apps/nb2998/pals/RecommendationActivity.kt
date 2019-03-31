package com.apps.nb2998.pals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class RecommendationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        supportActionBar?.title = "Recommendations"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recdIntent = intent
        val isMusic = recdIntent.getBooleanExtra(getString(R.string.intent_is_music), false)
        val isBooks = recdIntent.getBooleanExtra(getString(R.string.intent_is_books), false)
        val isMovies = recdIntent.getBooleanExtra(getString(R.string.intent_is_movies), false)

        val recViewRecom: RecyclerView = findViewById(R.id.recViewRecom)
        val listOfRecom = ArrayList<Recommendation>()


//        if (isBooks) {
        listOfRecom.add(0, Recommendation("Witness (1985)", "Drama|Romance|Thriller"))
        listOfRecom.add(1, Recommendation("Rain man (1968)", "Drama"))
        listOfRecom.add(2, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
        listOfRecom.add(3, Recommendation("Amadeus (1984)", "Drama"))
        listOfRecom.add(4, Recommendation("Dead Poets society (1989)", "Drama"))
        listOfRecom.add(5, Recommendation("Stand by me (1986)", "Adventure|Comedy|Drama"))
        listOfRecom.add(6, Recommendation("Ordinary People (1980)", "Drama"))
        listOfRecom.add(7, Recommendation("Driving Miss Daisy (1989)", "Drama"))
        listOfRecom.add(8, Recommendation("Dead Poets society (1989)", "Drama"))
        listOfRecom.add(9, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
        listOfRecom.add(10, Recommendation("Rain man (1968)", "Drama"))

//        } else if (isMovies) {
//            listOfRecom.add(0, Recommendation("Stand by me (1986)", "Adventure|Comedy|Drama"))
//            listOfRecom.add(1, Recommendation("Full Metal Jacket (1987)", "Action|War|Drama"))
//            listOfRecom.add(2, Recommendation("Rain man (1968)", "Drama"))
//            listOfRecom.add(3, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
//            listOfRecom.add(4, Recommendation("Witness (1985)", "Drama|Romance|Thriller"))
//            listOfRecom.add(5, Recommendation("Rain man (1968)", "Drama"))
//            listOfRecom.add(6, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
//            listOfRecom.add(7, Recommendation("Amadeus (1984)", "Drama"))
//            listOfRecom.add(8, Recommendation("Dead Poets society (1989)", "Drama"))
////        } else if (isMusic) {
//            listOfRecom.add(0, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
//            listOfRecom.add(1, Recommendation("Witness (1985)", "Drama|Romance|Thriller"))
//            listOfRecom.add(2, Recommendation("Rain man (1968)", "Drama"))
//            listOfRecom.add(3, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
//            listOfRecom.add(4, Recommendation("Witness (1985)", "Drama|Romance|Thriller"))
//            listOfRecom.add(5, Recommendation("Rain man (1968)", "Drama"))
//            listOfRecom.add(6, Recommendation("Star Wars (1983)", "Action|Adventure|Thriller"))
//            listOfRecom.add(7, Recommendation("Amadeus (1984)", "Drama"))
//            listOfRecom.add(8, Recommendation("Dead Poets society (1989)", "Drama"))
//        }


        val adapter = RecomAdapter(this@RecommendationActivity, listOfRecom)
        recViewRecom.layoutManager = LinearLayoutManager(this@RecommendationActivity)
        recViewRecom.adapter = adapter

    }
}

package com.example.voterapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
const val EXTRA_MESSAGE = "com.example.voterapplication.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the "Present the ballot" button */
    fun presentBallot(view: View) {
        val intent = Intent(this, Ballot::class.java)
        startActivity(intent)
    }
}

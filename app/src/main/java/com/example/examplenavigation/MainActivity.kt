package com.example.examplenavigation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
//^ Kotlin extentions are porting the activity_main xml and granting us access to the views bt & etxt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt.setOnClickListener {
            val name = etxt.text.toString()
            if (name.equals("Katri", true) || name.equals("Keni", true)) {
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("name", name) // here we travel to the second activity and
                    // pass it the name value with the key name "name"
                }
                startActivity(intent)
                finish() // this method closes the activity, in this case the MainActivity
                // so when pressing the back button the app closes as it doesn't have
                // an activity to come back to
            } else if (name.equals("Mörkö", true)) {
                val intent = Intent(this, MorkoActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Cool name, " + name + ", but not cool enough", Toast.LENGTH_LONG).show()
            }
        }
    }
}

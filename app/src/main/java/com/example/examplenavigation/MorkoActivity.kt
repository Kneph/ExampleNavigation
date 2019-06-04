package com.example.examplenavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_morko.*

class MorkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morko)

        Glide.with(this)
            .load("https://media.giphy.com/media/8YTKeVN9F3gFFaunRC/giphy.gif")
            .into(image)
    }
}

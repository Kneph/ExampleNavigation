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
            .load("https://antroblogi.fi/wp-content/uploads/2019/05/AB-Uutiset-n-2-1170x550.jpg")
            .centerCrop()
            .into(image)
    }
}

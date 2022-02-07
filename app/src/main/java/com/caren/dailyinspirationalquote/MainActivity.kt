package com.caren.dailyinspirationalquote

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.currentlyDisplayedQuote.observe(this,
            { findViewById<TextView>(R.id.text).text = it?.quote })

        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.getNewQuote()
        }
    }
}
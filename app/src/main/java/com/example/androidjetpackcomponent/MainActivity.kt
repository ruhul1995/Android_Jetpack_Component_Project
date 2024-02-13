package com.example.androidjetpackcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/*
    Steps to How to use DataBinding in Android Project.
    1. Enable Data Binding
    2. Wrap Xml with layout tags.
    3. Construct a data binding object
    4. Eliminate findViewById() codes
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.submit_button)
        button.setOnClickListener {
            displayMessage()
        }
    }

    private fun displayMessage() {
        val messageView = findViewById<TextView>(R.id.welcome_text_view)
        val nameText = findViewById<EditText>(R.id.name_edit_text)
        messageView.text = "Hello Boss! "+ nameText.text
    }
}
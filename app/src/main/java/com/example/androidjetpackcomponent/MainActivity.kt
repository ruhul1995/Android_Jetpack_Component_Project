package com.example.androidjetpackcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.androidjetpackcomponent.databinding.ActivityMainBinding

/*
    Steps to How to use DataBinding in Android Project.
    1. We have enable Data Binding in build.gradle(app) file.
    2. We wrap XML with layout tags for UI.
    3. We have to create a data binding object to access it.
    4. We will eliminate findViewById() codes.
*/

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Before DataBinding
        //setContentView(R.layout.activity_main)

        //After DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Before DataBinding
        /*val button = findViewById<Button>(R.id.submit_button)
        button.setOnClickListener {
            displayMessage()
        }*/

        //After DataBinding
        binding.submitButton.setOnClickListener {
            displayMessage()
        }

    }

    private fun displayMessage() {

        //Before DataBinding
       /* val messageView = findViewById<TextView>(R.id.welcome_text_view)
        val nameText = findViewById<EditText>(R.id.name_edit_text)
        messageView.text = "Hello Boss! "+ nameText.text*/

        //After DataBinding
        //binding.welcomeTextView.text = "Hello Boss!" + binding.nameEditText.text

        binding.apply {
            welcomeTextView.text = "Hello Boss!" + nameEditText.text
        }
    }
}
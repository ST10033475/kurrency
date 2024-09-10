package com.example.currencyconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var ConvertButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ConvertButton = findViewById(R.id.Convert)
        ConvertButton.setOnClickListener{
            val inputCurr = findViewById(R.id.InputCurrency) as EditText
            val outputCurr = findViewById(R.id.OutputCurrency) as EditText
            val inputAmt = findViewById(R.id.InputAmount) as EditText
            val InputAmount = inputAmt.text.toString()
            val InputCurrency = inputCurr.text.toString()
            val OutputCurrency = outputCurr.text.toString()


    }
}}
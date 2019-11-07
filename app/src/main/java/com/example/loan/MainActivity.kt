package com.example.loan

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        buttonCal.setOnClickListener(){
            val value:Double =  carPrice.text.toString().toDouble()
            val value1:Double = downPay.text.toString().toDouble()
            val value2:Double = value-value1


            buttonCal.text = "%.2f".format(value2)

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)

        }

        btnInt.setOnClickListener(){
            val value3:Double =  buttonCal.text.toString().toDouble()
            val value4:Double = intRate.text.toString().toDouble()
            val value5:Double = loanPeriod.text.toString().toDouble()
            val value6:Double = value3*(value4/100)*value5


            btnInt.text = "%.2f".format(value6)
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)

        }

        btnRepay.setOnClickListener(){
            val value7:Double =  buttonCal.text.toString().toDouble()
            val value8:Double = btnInt.text.toString().toDouble()
            val value9:Double = loanPeriod.text.toString().toDouble()
            val value10:Double = (value7+value8) / 12 / value9


            btnRepay.text = "%.2f".format(value10)
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)

        }


    }
}

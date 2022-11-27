package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var backPressedTime = 0L
    override fun onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        }
        else
        {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime=System.currentTimeMillis()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val res=findViewById(R.id.result) as TextView
        val fn=findViewById(R.id.firstnumber) as EditText
        val sn=findViewById(R.id.secondnumber) as EditText
        val add=findViewById(R.id.add) as Button
        val sub=findViewById(R.id.sub) as Button
        val mul=findViewById(R.id.mul) as Button
        val div=findViewById(R.id.div) as Button


        add.setOnClickListener {

            res.text=(fn.text.toString().toInt()+sn.text.toString().toInt()).toString()
        }
        sub.setOnClickListener {

            res.text=(fn.text.toString().toInt()-sn.text.toString().toInt()).toString()
        }
        mul.setOnClickListener {

            res.text=(fn.text.toString().toInt()*sn.text.toString().toInt()).toString()
        }
        div.setOnClickListener {

            res.text=(fn.text.toString().toFloat()/sn.text.toString().toFloat()).toString()
        }


    }

}
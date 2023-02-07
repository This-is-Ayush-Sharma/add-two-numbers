package com.example.simpleapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var TxtName:TextView
    lateinit var changeBtn:Button
    lateinit var cancelBtn: Button
    lateinit var add:Button
    lateinit var num1:EditText
    lateinit var num2:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TxtName = findViewById(R.id.txtnm)
        changeBtn = findViewById(R.id.change)
        cancelBtn = findViewById(R.id.cancel)
        add = findViewById(R.id.add)
        num1 = findViewById(R.id.no1)
        num2 = findViewById(R.id.no2)
        changeBtn.setOnClickListener{
            TxtName.text = "Rayagada"
            Toast.makeText(this, "text has been changed to Rayagada", Toast.LENGTH_SHORT).show()
        }
        cancelBtn.setOnClickListener{
            TxtName.text = "GUNUPUR"
            Toast.makeText(this, "text has been changed to Gunupur", Toast.LENGTH_SHORT).show()
        }
        add.setOnClickListener{

            if (!num1.text.isEmpty() || !num2.text.isEmpty())
            {
                var data = num1.text.toString().toInt() + num2.text.toString().toInt()
                TxtName.text = "Sum is ${data}"
                Toast.makeText(this, "the sum is ${data}", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "Empty value found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
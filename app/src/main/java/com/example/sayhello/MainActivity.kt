package com.example.sayhello

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //button1 = findViewById<Button>(R.id.btn1);

        binding.btn1.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요",
                Toast.LENGTH_SHORT).show()
        }
    }
}

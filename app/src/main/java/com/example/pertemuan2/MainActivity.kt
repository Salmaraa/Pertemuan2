package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hello Teman Teman",Toast.LENGTH_LONG).show()
            }
        }
    }
}
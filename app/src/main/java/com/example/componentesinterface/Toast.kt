package com.example.componentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.componentesinterface.databinding.ActivityToastBinding

class Toast : AppCompatActivity() {

    private lateinit var binding: ActivityToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            abrirToast()
        }
    }

    private fun abrirToast() {
        val imagem= ImageView(applicationContext)
        imagem.setImageResource(R.drawable.mario3)

        val toast = Toast(applicationContext)
        toast.duration =Toast.LENGTH_SHORT
        toast.view = imagem
        toast.show()
    }
}
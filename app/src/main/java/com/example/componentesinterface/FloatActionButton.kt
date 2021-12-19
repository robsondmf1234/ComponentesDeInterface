package com.example.componentesinterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivityFloatActionButtonBinding

class FloatActionButton : AppCompatActivity() {

    lateinit var binding: ActivityFloatActionButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFloatActionButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.floatingActionButton.setOnClickListener {
            mostrarMensagem()
        }
    }

    private fun mostrarMensagem() {
        Toast.makeText(this,"Fab clicado",Toast.LENGTH_SHORT).show()
    }
}
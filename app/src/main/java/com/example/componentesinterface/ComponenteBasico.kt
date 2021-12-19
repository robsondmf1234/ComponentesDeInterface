package com.example.componentesinterface

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivityComponenteBasicoBinding

class ComponenteBasico : AppCompatActivity() {

    private lateinit var binding: ActivityComponenteBasicoBinding
    private lateinit var campoNome: String
    private lateinit var campoEmail: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComponenteBasicoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            enviar()
        }


    }

    @SuppressLint("SetTextI18n")
    fun enviar() {
        campoNome = binding.editNome.text.toString()
        campoEmail = binding.editEmail.text.toString()
        Toast.makeText(applicationContext, "Texto: $campoNome", Toast.LENGTH_SHORT).show()
        binding.textResultado.text = "Olá $campoNome , seu Email: $campoEmail"
    }

    fun limpar(){
        binding.editNome.setText("")
        binding.editEmail.setText("")
    }
}
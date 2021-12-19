package com.example.componentesinterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivityToggleButtomAndSwitchButtonBinding

class ToggleButtomAndSwitchButton : AppCompatActivity() {

    private lateinit var binding: ActivityToggleButtomAndSwitchButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToggleButtomAndSwitchButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listenerToogle()
        listenerSwitch()
        enableButton()

    }

    private fun enableButton() {
        binding.button.setOnClickListener {
            validaComponentes()
            Toast.makeText(applicationContext, "Teste", Toast.LENGTH_SHORT).show()
        }
    }

    private fun listenerToogle() {
        binding.toogleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Toogle Ligado.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(
                    applicationContext, "Toogle Desligado.", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun listenerSwitch() {
        binding.switchCompat.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Senha será lembrada.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(
                    applicationContext, "Senha não será " +
                            "lembrado.", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun validaComponentes() {
        if (binding.toogleButton.isChecked) {
            binding.txtResultado.text = "Resultado: Toogle está ligado."
        } else {
            binding.txtResultado.text = "Resultado:  Toogle está desligado."
        }

/*        if (binding.switchCompat.isChecked) {
            Toast.makeText(applicationContext, "Senha lembrado.", Toast.LENGTH_SHORT).show()
            binding.txtResultado.text = "Resultado: Senha vai ser lembrada."
        } else {
            binding.txtResultado.text = "Resultado: Senha não vai ser lembrada."
        }*/
    }
}
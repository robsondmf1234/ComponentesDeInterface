package com.example.componentesinterface

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivityCaixaDeSelecaoBinding

class CaixaDeSelecao : AppCompatActivity() {

    private lateinit var binding: ActivityCaixaDeSelecaoBinding
    private lateinit var campoNome: String
    private lateinit var campoEmail: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaixaDeSelecaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEnviar.setOnClickListener {
            enviar()
        }
        binding.buttonLimpar.setOnClickListener {
            limpar()
        }

        //Listener para o radioGroup
        listenerRadioGroup()

    }

    private fun listenerRadioGroup() {

        //Listener para o RadioGroup
        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButtonMasculino) {
                Toast.makeText(applicationContext, "Sexo Masculino selecionado", Toast.LENGTH_SHORT)
                    .show()
            } else if (checkedId == R.id.radioButtonFeminino) {
                Toast.makeText(applicationContext, "Sexo Feminino selecionado", Toast.LENGTH_SHORT)
                    .show()

            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun enviar() {
        campoNome = binding.editNome.text.toString()
        campoEmail = binding.editEmail.text.toString()
        Toast.makeText(applicationContext, "Texto: $campoNome", Toast.LENGTH_SHORT).show()
        binding.textResultado.text = "Olá $campoNome , seu Email: $campoEmail"
        checkBox()
        radioButton()
    }

    fun limpar() {
        binding.editNome.setText("")
        binding.editEmail.setText("")
        binding.checkVerde.isChecked = false
        binding.checkAmarelo.isChecked = false
        binding.checkVermelho.isChecked = false
        binding.radioButtonMasculino.isChecked = false
        binding.radioButtonFeminino.isChecked = false
    }

    fun checkBox() {
        var texto: String = ""
        if (binding.checkVerde.isChecked) {
            val corSelecionada = binding.checkVerde.text.toString()
            texto = corSelecionada
            //     texto = "Verde Selecionado - "
        }
        if (binding.checkAmarelo.isChecked) {
            val corSelecionada = binding.checkAmarelo.text
            texto = texto + " " + corSelecionada.toString()
//            texto = texto + "Amarelo Selecionado - "
        }
        if (binding.checkVermelho.isChecked) {
            val corSelecionada = binding.checkVermelho.text
            texto = texto + " " + corSelecionada.toString()
            //    texto = texto + "Vermelho Selecionado"
        }
        if (!binding.checkVermelho.isChecked && !binding.checkAmarelo.isChecked && !binding.checkVerde.isChecked) {
            texto = "Nenhuma cor selecionada"
        }
        binding.textResultado.text = texto

    }

    fun radioButton() {
        if (binding.radioButtonMasculino.isChecked) {
            binding.textResultado.text = "Sexo Masculino Selecionado"
        } else if (binding.radioButtonFeminino.isChecked) {
            binding.textResultado.text = "Sexo Feminino Selecionado"
        }
    }
}
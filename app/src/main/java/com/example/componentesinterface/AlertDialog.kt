package com.example.componentesinterface

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.componentesinterface.databinding.ActivityAlertDialogBinding

class AlertDialog : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            mostrarAlert()
        }
    }

    private fun mostrarAlert() {
        //Instanciar AlertDialog
        val dialog = AlertDialog.Builder(this)

        //Setando texto para o alert
        dialog.setTitle("Titulo da dialog")
        dialog.setMessage("Mensagem da Dialog")

        //Configurar Cancelamento
        //Deixa o alertdialog travado na tela,
        // obrigando a ser selecionado alguma opção
        dialog.setCancelable(false)

        //Configurando ações sim e nao
        dialog.setPositiveButton("Sim", DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(applicationContext, "Sim clicado", Toast.LENGTH_SHORT).show()
        })
        dialog.setNegativeButton("Não", DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(applicationContext, "Não clicado", Toast.LENGTH_SHORT).show()
        })

        //Setando imagem no Dialog
        dialog.setIcon(android.R.drawable.ic_btn_speak_now)

        //Criando e mostrando o dialog
        dialog.create()
        dialog.show()
    }

    private fun simClicado() {
        Toast.makeText(this, "Sim clicado", Toast.LENGTH_SHORT).show()
    }
}
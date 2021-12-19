package com.example.componentesinterface

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    lateinit var binding: ActivitySnackBarBinding
    lateinit var snackbar: Snackbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBarBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonOpen.setOnClickListener {
            showSnackBar()
        }
        binding.buttonClosed.setOnClickListener {
            closedSnackBar()
        }

    }

    private fun closedSnackBar() {
        snackbar.dismiss()
    }

    private fun showSnackBar() {
        snackbar =
            Snackbar.make(
                binding.root,
                "Quer fechar o snackbar ?",
                Snackbar.LENGTH_INDEFINITE
            ).setAction(
                "Sim", View.OnClickListener {
                    Toast.makeText(
                        applicationContext,
                        "Botão da SnackBar clicada",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            )
        snackbar.setActionTextColor(getColor(R.color.yellow))
        snackbar.show()
    }
}

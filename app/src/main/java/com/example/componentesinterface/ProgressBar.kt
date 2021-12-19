package com.example.componentesinterface

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivityProgressBarBinding

class ProgressBar : AppCompatActivity() {
    private lateinit var binding: ActivityProgressBarBinding
    private var progresso: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProgressBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressCircular.visibility = View.GONE

        binding.button.setOnClickListener {
            carregarProgressBarHorizontal()
        }
    }

    private fun carregarProgressBarHorizontal() {

        //ProgressBar Horizontal
        progresso += 1
        binding.progressBarHorizontal.progress = progresso
        binding.progressCircular.visibility = View.VISIBLE
        Toast.makeText(this, "Progresso $progresso",Toast.LENGTH_SHORT).show()

        if (progresso==11){
            progresso=0
            binding.progressCircular.visibility = View.GONE
            binding.progressBarHorizontal.progress = progresso
        }
    }


}
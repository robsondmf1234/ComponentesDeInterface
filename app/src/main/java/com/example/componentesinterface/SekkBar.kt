package com.example.componentesinterface

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.componentesinterface.databinding.ActivitySekkBarBinding

class SekkBar : AppCompatActivity() {
    private lateinit var binding: ActivitySekkBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySekkBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Listener que vai ficar obsrevando e setando os valores do seekBar no textResultado
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (seekBar != null) {
                    binding.textResultado.text = "Progresso: ${progress} / ${seekBar.max}"
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
               /* Toast.makeText(
                    this@SekkBar,
                    "onStartTrackingTouch sendo chamado",
                    Toast.LENGTH_SHORT
                ).show()
*/
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
             /*   Toast.makeText(
                    this@SekkBar,
                    "onStopTrackingTouch sendo chamado",
                    Toast.LENGTH_SHORT
                ).show()
*/
            }
        })
    }
}

package com.chirikualii.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resultA = intent.getStringExtra("ResultTeamA") ?: "Team A"
        resultB = intent.getStringExtra("ResultTeamB") ?: "Team B"

        binding.tvResultA.text = resultA
        binding.tvResultB.text = resultB


        /**
         * TODO
          tampilkan data dari activity match seperti pada layout [activity_result.XML]
         **/


    }
}
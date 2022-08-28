package com.example.earthshape

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.earthshape.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
//    либо вот так binding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.butAnswer.setOnClickListener {
            when (binding.radioGroup.checkedRadioButtonId) {
                R.id.rbDisk -> {
                    binding.tvAnswer.text = "Неправильно!"
                }
                R.id.rbSphere -> {
                    binding.tvAnswer.text = "Правильно!"
                }
                R.id.rbEllipsoid -> {
                    binding.tvAnswer.text = "Неправильно!"
                }
                R.id.rbCube -> {
                    binding.tvAnswer.text = "Неправильно!"
                }
                else -> {
                    binding.tvAnswer.text = "Неправильно!"
                }
            }
        }
    }
}
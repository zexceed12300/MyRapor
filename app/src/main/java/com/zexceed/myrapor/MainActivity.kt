package com.zexceed.myrapor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zexceed.myrapor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imgNext.setOnClickListener {
                val intent = Intent(this@MainActivity, AddNilaiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.zexceed.myrapor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zexceed.myrapor.databinding.ActivityRaporBinding

class RaporActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRaporBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRaporBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val nisn = intent.getStringExtra("nisn")
        val agama = intent.getStringExtra("agama")
        val database = intent.getStringExtra("database")
        val bIndo = intent.getStringExtra("bIndo")
        val bInggris = intent.getStringExtra("bInggris")
        val jaringan = intent.getStringExtra("jaringan")
        val mtk = intent.getStringExtra("mtk")
        val semester = intent.getStringExtra("semester")
        val jurusan = intent.getStringExtra("jurusan")
        val kelas = intent.getStringExtra("kelas")

        binding.apply {
            tvName.text = name
            tvNisn.text = nisn
            tvAgama.text = agama
            tvDatabase.text = database
            tvBIndo.text = bIndo
            tvBInggris.text = bInggris
            tvJaringan.text = jaringan
            tvMatematika.text = mtk
            tvSemester.text = semester
            tvJurusan.text = jurusan
            tvKelas.text = kelas

            imgBack.setOnClickListener {
                intent = Intent(this@RaporActivity, AddNilaiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
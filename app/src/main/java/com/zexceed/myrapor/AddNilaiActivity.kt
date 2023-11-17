package com.zexceed.myrapor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.zexceed.myrapor.databinding.ActivityAddNilaiBinding
import com.zexceed.myrapor.databinding.ActivityRaporBinding

class AddNilaiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNilaiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNilaiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterkelas = ArrayAdapter.createFromResource(this, R.array.kelas_array, android.R.layout.simple_spinner_item)
        adapterkelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerKelas.adapter = adapterkelas

        val adapterjurusan = ArrayAdapter.createFromResource(this, R.array.jurusan_array, android.R.layout.simple_spinner_item)
        adapterkelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerJurusan.adapter = adapterjurusan

        val adaptersemester = ArrayAdapter.createFromResource(this, R.array.semester_array, android.R.layout.simple_spinner_item)
        adapterkelas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerSemester.adapter = adaptersemester

        binding.btnAddData.setOnClickListener {
            binding.apply {
                val name = edtName.text.toString()
                val nisn = edtNisn.text.toString()
                val agama = edtAgama.text.toString()
                val database = edtDatabase.text.toString()
                val bIndo = edtBIndo.text.toString()
                val bInggris = edtBIngris.text.toString()
                val jaringan = edtJaringan.text.toString()
                val mtk = edtMtk.text.toString()
                val semester = spinnerSemester.selectedItem.toString()
                val jurusan = spinnerJurusan.selectedItem.toString()
                val kelas = spinnerKelas.selectedItem.toString()

                if(validateInput(name, nisn)) {
                    val intent = Intent(this@AddNilaiActivity, RaporActivity::class.java)
                    intent.putExtra("name", name)
                    intent.putExtra("nisn", nisn)
                    intent.putExtra("agama", agama)
                    intent.putExtra("database", database)
                    intent.putExtra("bIndo", bIndo)
                    intent.putExtra("bInggris", bInggris)
                    intent.putExtra("jaringan", jaringan)
                    intent.putExtra("mtk", mtk)
                    intent.putExtra("semester", semester)
                    intent.putExtra("jurusan", jurusan)
                    intent.putExtra("kelas", kelas)
                    startActivity(intent)
                }
            }
        }
    }

    private fun validateInput(
        name: String,
        nisn: String
    ): Boolean {
        binding.apply {
            if (name.isEmpty()) {
                Toast.makeText(this@AddNilaiActivity, "Name tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            else if (nisn.isEmpty()) {
                Toast.makeText(this@AddNilaiActivity, "Nisn tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            }
            /*
            * implementasi field lainnya disini!
            */
            else {
                return true
            }
        }
        return false
    }
}
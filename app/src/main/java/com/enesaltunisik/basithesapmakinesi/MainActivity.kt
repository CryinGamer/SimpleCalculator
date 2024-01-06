package com.enesaltunisik.basithesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import com.enesaltunisik.basithesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var sayi1 : Double? = null
    var sayi2 : Double? = null
    var sonuc: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun toplama(view: View) {
        sayi1 = binding.sayi1text.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2text.text.toString().toDoubleOrNull()

        if (sayi1 == null || sayi2 == null) {
            binding.sonucText.text = "Hata!, Sayılardan biri veya ikisi eksik!"
        } else {
            sonuc = sayi1!! + sayi2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun cikarma(view: View) {
        sayi1 = binding.sayi1text.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2text.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            binding.sonucText.text = "Hata!, Sayılardan biri veya ikisi eksik!"
        } else {
            sonuc = sayi1!! - sayi2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun carpma(view: View) {
        sayi1 = binding.sayi1text.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2text.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            binding.sonucText.text = "Hata!, Sayılardan biri veya ikisi eksik!"
        } else {
            sonuc = sayi1!! * sayi2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun bolme(view: View) {
        sayi1 = binding.sayi1text.text.toString().toDoubleOrNull()
        sayi2 = binding.sayi2text.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null) {
            binding.sonucText.text = "Hata!, Sayılardan biri veya ikisi eksik!"
        } else {
            sonuc = sayi1!! / sayi2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        }
    }
}


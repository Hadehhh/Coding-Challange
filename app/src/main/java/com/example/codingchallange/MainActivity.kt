package com.example.codingchallange

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        when (view.id) {
            R.id.box_one_text -> {
                boxOneText.setBackgroundResource(R.color.Biru)
                boxTwoText.setBackgroundResource(R.color.Biru)
                boxThreeText.setBackgroundResource(R.color.Biru)
                boxFourText.setBackgroundResource(R.color.Biru)
                boxFiveText.setBackgroundResource(R.color.Biru)
                boxSixText.setBackgroundResource(R.color.Biru)

                val toast = Toast.makeText(this, "Berhasil Mengubah ke Warna Biru", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP, 0, 0)
                toast.show()
            }
            R.id.box_two_text -> {
                boxOneText.setBackgroundResource(R.color.Merah)
                boxTwoText.setBackgroundResource(R.color.Merah)
                boxThreeText.setBackgroundResource(R.color.Merah)
                boxFourText.setBackgroundResource(R.color.Merah)
                boxFiveText.setBackgroundResource(R.color.Merah)
                boxSixText.setBackgroundResource(R.color.Merah)

                Toast.makeText(this, "Berhasil Mengubah ke Warna Merah", Toast.LENGTH_SHORT).show()
            }
            R.id.box_three_text -> {
                boxOneText.setBackgroundResource(R.color.Hijau)
                boxTwoText.setBackgroundResource(R.color.Hijau)
                boxThreeText.setBackgroundResource(R.color.Hijau)
                boxFourText.setBackgroundResource(R.color.Hijau)
                boxFiveText.setBackgroundResource(R.color.Hijau)
                boxSixText.setBackgroundResource(R.color.Hijau)

                Toast.makeText(this, "Berhasil Mengubah ke Warna Hijau", Toast.LENGTH_SHORT).show()
            }
            R.id.box_four_text -> {
                boxOneText.setBackgroundResource(R.color.Kuning)
                boxTwoText.setBackgroundResource(R.color.Kuning)
                boxThreeText.setBackgroundResource(R.color.Kuning)
                boxFourText.setBackgroundResource(R.color.Kuning)
                boxFiveText.setBackgroundResource(R.color.Kuning)
                boxSixText.setBackgroundResource(R.color.Kuning)

                Toast.makeText(this, "Berhasil Mengubah ke Warna Kuning", Toast.LENGTH_SHORT).show()
            }
            R.id.box_five_text -> {
                boxOneText.setBackgroundResource(R.color.Hitam)
                boxTwoText.setBackgroundResource(R.color.Hitam)
                boxThreeText.setBackgroundResource(R.color.Hitam)
                boxFourText.setBackgroundResource(R.color.Hitam)
                boxFiveText.setBackgroundResource(R.color.Hitam)
                boxSixText.setBackgroundResource(R.color.Hitam)

                Toast.makeText(this, "Berhasil Mengubah ke Warna Hitam", Toast.LENGTH_SHORT).show()
            }
            R.id.box_six_text -> {
                boxOneText.setBackgroundResource(R.color.Biru)
                boxTwoText.setBackgroundResource(R.color.Merah)
                boxThreeText.setBackgroundResource(R.color.Hijau)
                boxFourText.setBackgroundResource(R.color.Kuning)
                boxFiveText.setBackgroundResource(R.color.Hitam)
                boxSixText.setBackgroundResource(R.color.Grey)

                Toast.makeText(this, "Berhasil Mengembalikan ke Warna Default", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)

        val clickableViews: List<View> =
            listOf(
                boxOneText,
                boxTwoText,
                boxThreeText,
                boxFourText,
                boxFiveText,
                boxSixText
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
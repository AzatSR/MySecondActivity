package com.azat.mysecondactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//создаем ключ
private const val KEY = "Hello_KEY"

class MainActivity : AppCompatActivity() {

//объявляем кнопки и текстовую вьюшку
    private lateinit var buttonGruz: Button
    private lateinit var buttonRaznorab: Button
    private lateinit var textVibor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//ищем идентификатор вьюшек
        buttonGruz = findViewById(R.id.button_gruz)
        buttonRaznorab = findViewById(R.id.button_raznorab)
        textVibor = findViewById(R.id.text_vibor)

//объявляем интент и передаем значение по ключу на вторую активность
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(KEY, "шаг 1")

//запускаем команду- слушать кнопку и активируем интент
        buttonGruz.setOnClickListener{
            startActivity(intent)
        }
//запускаем интент для другой кнопки на тот же экран
        buttonRaznorab.setOnClickListener{
            startActivity(intent)
        }
    }
}
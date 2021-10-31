package com.azat.mysecondactivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//объявляем ключ по которому будем принимать данные
private const val KEY2 = "Hello_KEY2"

class ThirdActivity : AppCompatActivity() {
//объявляем кнопку
    private lateinit var poiskovik: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
//ищем по идентификатору
        poiskovik = findViewById(R.id.poiskovik)

//объявляем интент и запрашиваем данные по ключу
        val getValueFromSecondActivity = intent.extras?.getString(KEY2)
//выводим сообщение всплывающее
        Toast.makeText(this, getValueFromSecondActivity, Toast.LENGTH_SHORT).show()

//создаем неявный интент в виде ссылки
        val link = Uri.parse("https://www.avito.ru/rossiya/predlozheniya_uslug?q=грузчики")
        val thirdActivityintent = Intent(Intent.ACTION_VIEW, link)
//запускаем поиск
        poiskovik.setOnClickListener{
            startActivity(thirdActivityintent)
        }

    }
}


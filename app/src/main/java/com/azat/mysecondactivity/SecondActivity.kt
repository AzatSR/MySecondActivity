package com.azat.mysecondactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//создаем два ключа: один для MainActivity, второй для ThirdActivity
private const val KEY = "Hello_KEY"
private const val KEY2 = "Hello_KEY2"

class SecondActivity : AppCompatActivity() {
//объявляем вьюшки
    private lateinit var textView2: TextView
    private lateinit var buttonHours: Button
    private lateinit var buttonSmena: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//ищем идентификаторы вьюшек
        textView2 = findViewById(R.id.text_view_2)
        buttonHours = findViewById(R.id.button_hours)
        buttonSmena = findViewById(R.id.button_smena)

/*объвляем интент, объявляем value и принимаем значение с MainActivity,
в виде всплывающего сообщения*/
        val intent1 = intent
        val value = intent1.extras?.getString(KEY)
        Toast.makeText(this,value, Toast.LENGTH_SHORT).show()

//объявляем интент2 и передаем по ключу KEY2 значение в ThirdActivity
        val intent2 = Intent(this, ThirdActivity::class.java)
        intent2.putExtra(KEY2, "шаг 2")

//запускаем интент по кнопкам на ThirdActivity
        buttonHours.setOnClickListener {
            startActivity(intent2)
        }
        buttonSmena.setOnClickListener {
            startActivity(intent2)
        }

    }
    }



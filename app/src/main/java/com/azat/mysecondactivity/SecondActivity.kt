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
        val getValueFromMainActivity = intent.extras?.getString(KEY)
        Toast.makeText(this,getValueFromMainActivity, Toast.LENGTH_SHORT).show()

//объявляем интент2 и передаем по ключу KEY2 значение в ThirdActivity
        val secondActivityintent = Intent(this, ThirdActivity::class.java)
        secondActivityintent.putExtra(KEY2, "шаг 2")

//запускаем интент по кнопкам на ThirdActivity
        buttonHours.setOnClickListener {
            startActivity(secondActivityintent)
        }
        buttonSmena.setOnClickListener {
            startActivity(secondActivityintent)
        }

    }
    }



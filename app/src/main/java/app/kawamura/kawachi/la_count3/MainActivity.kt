package app.kawamura.kawachi.la_count3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.kawamura.kawachi.la_count3.databinding.ActivityMainBinding

//reviewed by toppo 🧸: MainActivityじゃなく、TutorialActivityがアプリ初期起動の画面になるようにmanifestsの設定をしてみよう！
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //🧸: viewBindingが使えていてGood
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
        binding.button2.setOnClickListener {
            val toNextActivityIntent = Intent(this, TutorialActivity::class.java)
            startActivity(toNextActivityIntent)
        }
    }


    //🧸: 余分な空白行を消そう！コードが長くなった時にも読みやすくなるよ
}
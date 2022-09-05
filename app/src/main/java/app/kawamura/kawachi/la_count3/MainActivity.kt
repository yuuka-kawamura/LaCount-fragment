package app.kawamura.kawachi.la_count3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.kawamura.kawachi.la_count3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
        binding.button2.setOnClickListener {
            val toNextActivityIntent = Intent(this, TutorialActivity::class.java)
            startActivity(toNextActivityIntent)
        }
    }


}
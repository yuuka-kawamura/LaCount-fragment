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
        // Doggy: Button が1つしかないので、button2 ではなく button という id 名にすると良さそう！
        //  ただ、 button という名前だと何の button か分からないので
        //  tutorial_button など、押したらどのような処理をするボタンか分かりやすくしても良さそう！
        binding.button2.setOnClickListener {
            val toNextActivityIntent = Intent(this, TutorialActivity::class.java)
            startActivity(toNextActivityIntent)
        }
    }


}
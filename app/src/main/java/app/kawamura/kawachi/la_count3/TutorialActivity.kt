package app.kawamura.kawachi.la_count3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import app.kawamura.kawachi.la_count3.databinding.ActivityTutorialBinding

// Doggy: アプリを起動して、 TutorialActivity を最初に表示する方法を調べてみよう！
class TutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityTutorialBinding.inflate(layoutInflater).apply { setContentView(this.root) }



        binding.viewPager.adapter = ViewPagerAdapter(this)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // Doggy: 使用していない変数は削除しよう！
        val maxItemCount: Int = binding.viewPager.adapter?.itemCount ?: 0

        // Doggy: 使用していない処理は削除しよう！
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)


            }

        })


    }
}
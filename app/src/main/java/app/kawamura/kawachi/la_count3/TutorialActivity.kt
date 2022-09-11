package app.kawamura.kawachi.la_count3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import app.kawamura.kawachi.la_count3.databinding.ActivityTutorialBinding

class TutorialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTutorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityTutorialBinding.inflate(layoutInflater).apply { setContentView(this.root) }


        //🧸: Adapterが使えててGood！
        binding.viewPager.adapter = ViewPagerAdapter(this)
        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        //🧸: 使っていない変数は消そう
        val maxItemCount: Int = binding.viewPager.adapter?.itemCount ?: 0

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)


            }

        })


    }
}
package app.kawamura.kawachi.la_count3

import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import app.kawamura.kawachi.la_count3.databinding.FragmentThirdBinding
import android.content.Intent as Intent1

// Doggy: Fragment は作成すると不要なコードが多く生成されるので、不要なコードは削除しよう！

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val finish = view.findViewById<Button>(R.id.button)
        finish.setOnClickListener{
            Log.d("log", "finish button was pressed!")
            // Doggy: 以下のように、 requireActivity を使用すると書き方もあるよ！
            requireActivity().finish()
            // Doggy: Kotlin における ? の意味を調べてみよう！
            // activity?.finish()
        }

    }
}

// Doggy: もし今後使用しないコードであれば、削除しよう！
/*class ThirdFragment : Fragment(R.layout.fragment_third) {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //binding = FragmentThirdBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        val button: Button
        button = view.findViewById(R.id.button)
        // ボタンのリスナーを作成
        binding.FinishButton.setOnClickListener {

            /* val toMainActivityIntent = Intent(this, MainActivity::class.java)
              startActivity(toMainActivityIntent)
              startActivity(Intent(context, MainActivity::class.java))*/


        }
    }*/




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

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

//reviewed by toppo 🧸: 余分なFragmentの自動生成コードを消そう。FragmentではActivityと違うライフサイクルなので、Viewを生成するのに適切なタイミングが違うよ！
/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {
    //🧸: 基本、TODOがついているコメントは解決するのが良い！必要なければ消してしまおう。
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThirdFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    //🧸: Viewが生成された後の処理が適切なライフサイクルにバッチリ書けている！
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //findViewByIdではなく、viewBindingを使おう><
        val finish = view.findViewById<Button>(R.id.button)
        finish.setOnClickListener{
            Log.d("log", "finish button was pressed!")
            activity?.finish()
        }

    }
}

//🧸: 使わないコードは消そう
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




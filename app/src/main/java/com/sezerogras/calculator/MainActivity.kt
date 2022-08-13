package com.sezerogras.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sezerogras.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var num : Int? = null
    var num2 : Int? =  null
    var result : Int? = null

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view: View){

      num = binding.editText.text.toString().toIntOrNull()
      num2 = binding.editText2.text.toString().toIntOrNull()
        if (num  == null || num2 == null){
           binding.textView.text = "Error"
        }
        else {
             result = num!! + num2!!
            binding.textView.text = "Result : $result"
        }

    }

    fun mySub(view: View){

        num = binding.editText.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num  == null || num2 == null){
            binding.textView.text = "Error"
        }
        else {
            result = num!! - num2!!
            binding.textView.text = "Result : $result"
        }
    }

    fun myMultiply(view: View){

        num = binding.editText.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num  == null || num2 == null){
            binding.textView.text = "Error"
        }
        else {
            result = num!! * num2!!
            binding.textView.text = "Result : $result"
        }
    }

    fun myDev(view: View){
        num = binding.editText.text.toString().toIntOrNull()
        num2 = binding.editText2.text.toString().toIntOrNull()
        if (num  == null || num2 == null){
            binding.textView.text = "Error"
        }
        else {
            result = num!! / num2!!
            binding.textView.text = "Result : $result"
        }

    }
}
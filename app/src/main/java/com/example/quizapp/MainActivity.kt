package com.example.quizapp

import android.content.Intent
import android.os.Bundle
//import android.provider.SyncStateContract.Constants
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.Constants.USER_NAME

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val buttonStart = binding.btnStart
        val nameTxt = binding.etName

        buttonStart.setOnClickListener {
            if (nameTxt.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)

                intent.putExtra(Constants.USER_NAME, nameTxt.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}
package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {private val binding by lazy { ActivityResultBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val tvName: TextView = binding.tvName
        val tvScore: TextView = binding.tvScore
        val btnFinish: Button = binding.btnFinish

        /*
        Retrieve the username, no of questions, and correct answer from the Intent
       using their Key
        then start the ResultActivity using the Intent.
        */
        val userName = intent.getStringExtra(Constants.
        USER_NAME)
        tvName.text = userName

        val totalQuestions = intent.getIntExtra(Constant.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constant.CORRECT_ANSWERS, 0)

        tvScore.text = resources.getString(R.string.score,correctAnswers,totalQuestions)

        btnFinish.setOnClickListener {

            startActivity(Intent(this@ResultActivity,MainActivity::class.java))
        }
    }
    }
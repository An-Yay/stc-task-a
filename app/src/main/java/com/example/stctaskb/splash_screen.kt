package com.example.wapp

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.stctaskb.MainActivity
import com.example.stctaskb.R
import java.lang.Exception

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar!!.hide()
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val t: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(1900)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                } finally {
                    val intent = Intent(this@splash_screen, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
        t.start()
    }
}
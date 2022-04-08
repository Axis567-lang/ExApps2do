package com.lharo.exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMain = findViewById<Button>(R.id.mainBtn)
        btnMain.setOnClickListener(this)
    }

    override fun onClick(view: View)
    {
        val intent = when(view.id)
            {
                R.id.mainBtn -> Intent(this, MoviesActivity::class.java)

                else -> throw IllegalArgumentException("nohai sistema")
            }
        startActivity(intent)
    }
}
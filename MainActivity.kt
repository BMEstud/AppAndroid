package com.example.apptestskola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.apptestskola.R.id.btnNextActivity

import kotlinx.android.synthetic.main.activity_main.* //IMPORTERA ALLT FRÅN XML FILEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnNextActivity.setOnClickListener {
            val message: String = editText.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            //Navigate to second activity use class "intent"
            //only two lines of code necessary
            //Do not forget to add the new activity in the AndroidManifest"
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)







        }

    }
}

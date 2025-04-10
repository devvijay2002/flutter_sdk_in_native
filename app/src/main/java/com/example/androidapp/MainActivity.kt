package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchFlutterButton = findViewById<Button>(R.id.launchFlutterButton)
        launchFlutterButton.setOnClickListener {
            // Launch Flutter module
            startActivity(
                FlutterActivity
                    .withNewEngine()
                    .initialRoute("/") // you can pass route here if needed
                    .build(this)
            )
        }
    }
}

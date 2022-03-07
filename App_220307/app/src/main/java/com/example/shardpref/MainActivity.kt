package com.example.shardpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs: SharedPreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        // Java-like
        val editor: SHaredPreferences.Editor = prefs.edit()
        editor.putString(keyFirstName, "Elkana").commit()

        // Kotlin-y
    }
}
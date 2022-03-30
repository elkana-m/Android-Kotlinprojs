package com.example.shardpref

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val keyFirstName = "key_first_name"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs: SharedPreferences =
            getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)

        // Java-like
        val editor: SharedPreferences.Editor = prefs.edit()
        editor
            .putString(keyFirstName, "Elkana")
            .commit()

        // Kotlin-y
        with(prefs.edit()){
            putString(keyFirstName, "Elkana")
            commit()
        }

        val prefs2 = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE)
        val firstName = prefs2.getString(keyFirstName, "default value")

        Log.d("asdf", firstName.toString())
    }
}
package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickNameButton(it)
        }
    }

    fun addNickNameButton(view: View){
        val nickEdit = findViewById<EditText>(R.id.nickname_edit)
        val nickText = findViewById<TextView>(R.id.nickname_text)

        nickText.text = nickEdit.text

        nickEdit.visibility = View.GONE
        view.visibility = View.GONE

        nickText.visibility = View.VISIBLE

        //Hide the keyboard (Esconde o teclado após adicionar o nome)
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
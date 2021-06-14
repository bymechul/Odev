package com.example.odev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ddb.*
class DDBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ddb)
        if(intent.getStringExtra("Text") == null){
            Toast.makeText(getApplicationContext(),"No Data", Toast.LENGTH_LONG).show();
        }else{
            textView.text = intent.getStringExtra("Text")
        }
        hakkındaButton.setOnClickListener { view ->
            val intent = Intent(this,HakkındaActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var counter=0;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.example,menu);
        return true;
    }

    fun eat(view: View){
        counter++;
        findViewById<TextView>(R.id.moodLabel).text=""+counter;
        var btn=findViewById<Button>(R.id.btn);
//        var img=findViewById<ImageView>(R.id.imageView);
//        img.setImageResource(R.drawable.happy);
        btn.text="Done";

    }

}
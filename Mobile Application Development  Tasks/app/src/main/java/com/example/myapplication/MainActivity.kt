package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter=0;
    val sharedPrerences: SharedPreferences=getSharedPreferences("pref_name",Context.MODE_PRIVATE);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).text=""+counter;
        val sharedPreferences: SharedPreferences=this.getSharedPreferences("Pref_Name", Context.MODE_PRIVATE);
        var editor=sharedPreferences.edit();
        val intent=Intent(this,MainActivity2::class.java);
        startActivity(intent);
    }
    fun increase(view: View)
    {
        counter++;
        findViewById<TextView>(R.id.textView).text=""+counter;
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("num",counter);
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter=savedInstanceState.getInt("num",0);
        findViewById<TextView>(R.id.textView).text=""+counter;

    }
    fun save(view: View)
    {
        val f_name=findViewById<EditText>(R.id.first_name).text.toString();
        val last_name=findViewById<EditText>(R.id.last_name).text.toString();
        var edit=sharedPrerences.edit();
        edit.putString("fname",f_name);
        edit.putString("fname",last_name);
        edit.apply();
    }
    fun viewData(view: View)
    {

    }
    fun clear(view: View)
    {
        val edit=sharedPrerences.edit();
        edit.clear();
        edit.commit();
    }
}
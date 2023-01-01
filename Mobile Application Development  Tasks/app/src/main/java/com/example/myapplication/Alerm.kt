package com.example.myapplication
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Alerm : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerm)
        Toast.makeText(this, intent.getStringExtra("name"), Toast.LENGTH_SHORT).show()
    }
    fun setAlarm(view: View)
    {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, Alerm::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)
        intent.putExtra("name","haseeb")
        alarmManager.setRepeating(
            AlarmManager.RTC_WAKEUP,
            System.currentTimeMillis()+(1000),
            AlarmManager.INTERVAL_DAY,
            pendingIntent
        )
        Toast.makeText(this, "Alarm is set", Toast.LENGTH_SHORT).show()
    }
}
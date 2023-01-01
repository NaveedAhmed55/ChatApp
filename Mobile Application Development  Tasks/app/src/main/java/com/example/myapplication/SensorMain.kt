package com.example.myapplication

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SensorMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_main)
        //Step 1 sensor manager
        val sm: SensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        //step 2 Sensor
        val sensor: Sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY)
        sm.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onSensorChange(se: SensorEvent) {
        val string = "X : " + se!!.values[0];

    }

    override fun onAccuracyChange(se: SensorEvent) {
        TODO("Not implemented")
    }
}

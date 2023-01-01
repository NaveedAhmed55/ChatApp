package com.example.myapplication

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class dbServers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_db_servers)
//
//        //Step1
//        Thread(Runnable {
//        val url_string="https:://www.tutorialspoint/json/data.json"
//        val url= URL(url_string)
//
//        //step2
//        try {
//            val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
//
//            //step 3
//            connection.connect();
//
//            val reader: BufferedReader = BufferedReader(InputStreamReader(connection.inputStream))
//
//            var line: String? = readLine()
//            var data = "";
//
//            while (line != null) {
//                data += line;
//                line = readLine();
//            }
//
//            Log.d("data ", data)
//            connection.disconnect();
//        }
//        catch (e:IOException) {
//            System.out.println("Something went wrong.");
//        }
//        }).start()

        // step 1 Volly

//        val queue= Volley.newRequestQueue(this)
//
//        /* Step 2 */
//        val request=ImageRequest(
//            Request.Method.GET,
//            url:"https:://www.tutorialspoint/json/data.json",
//            Response.Listener{
//            });
//        //step 3
//        queue.add(request)
        
    }

}
package com.example.leaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    val client = OkHttpClient()
    var  allNames : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        run("https://gist.githubusercontent.com/shwetankshrey/adff97bc000273ac85b05e408582c23f/raw/c47eb153d1f55a9a085617c4449ab81eaa0dc094/leaderboard_d.json")
        val text: TextView = findViewById<TextView>(R.id.title_template)
        text.setOnClickListener {
            text.setText(allNames)
        }
    }

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {
                allNames += response.body()?.string()
            }
        })
    }
}
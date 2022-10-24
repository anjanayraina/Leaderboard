package com.example.leaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.example.Athletes
import com.google.gson.Gson
import org.json.JSONObject



class MainActivity : AppCompatActivity() {

    val name = arrayOf<String>("Nitik Jain","Anant Sharma")
    val score = arrayOf<String>("90","50")

    val imageId = arrayOf<Int>(
        R.drawable.ellipse,R.drawable.ellipse
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListAdapter = ListViewAdapter(this,name,score,imageId)
        val userList = findViewById<ListView>(R.id.userlist);
        userList.adapter = myListAdapter

    }


}



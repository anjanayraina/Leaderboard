package com.example.leaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.example.example.Athletes
import com.google.gson.Gson
import org.json.JSONObject



class MainActivity : AppCompatActivity() {

    var  allNames : String = ""
    val myJson = """
    {"organisation":"Fast Bowling- ABCD Workshop","athletes":[{"id":"001","name":"Nitik Jain","score":89,"runup":88,"jump":90,"bfc":85,"ffc":91,"release":91},{"id":"002","name":"Anant Sharma","score":81,"runup":89,"jump":76,"bfc":83,"ffc":77,"release":80},{"id":"003","name":"Anuj Singh","score":71,"runup":78,"jump":68,"bfc":69,"ffc":69,"release":71},{"id":"004","name":"Ayush Kushwaha","score":84,"runup":85,"jump":81,"bfc":87,"ffc":84,"release":83},{"id":"005","name":"Ananya Singh","score":72,"runup":70,"jump":78,"bfc":70,"ffc":73,"release":69},{"id":"006","name":"Ayush Kushwaha","score":67,"runup":67,"jump":67,"bfc":67,"ffc":67,"release":67},{"id":"007","name":"Soumyadip Ghorai","score":77,"runup":75,"jump":79,"bfc":77,"ffc":78,"release":76},{"id":"008","name":"Shwetank Shrey","score":82,"runup":82,"jump":82,"bfc":81,"ffc":85,"release":80},{"id":"009","name":"Joseph Hermis","score":68,"runup":69,"jump":68,"bfc":68,"ffc":69,"release":66},{"id":"010","name":"Yash Bhargava","score":63,"runup":60,"jump":60,"bfc":70,"ffc":62,"release":63}]}  
"""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }


}



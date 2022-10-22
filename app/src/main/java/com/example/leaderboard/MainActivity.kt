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

    val name = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
    val score = arrayOf<String>(
        "C programming is considered as the base for other programming languages",
        "C++ is an object-oriented programming language.",
        "Java is a programming language and a platform.",
        ".NET is a framework which is used to develop software applications.",
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting  and object-oriented programming language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e., there is no need for compilation.",
        "AJAX allows you to send and receive data asynchronously without reloading the web page.",
        "Perl is a cross-platform environment used to create network and server-side applications.",
        "Hadoop is an open source framework from Apache written in Java."
    )

    val imageId = arrayOf<Int>(
        R.drawable.ellipse,R.drawable.ellipse,R.drawable.ellipse,
        R.drawable.ellipse,R.drawable.ellipse,R.drawable.ellipse,
        R.drawable.ellipse,R.drawable.ellipse,R.drawable.ellipse,
        R.drawable.ellipse,R.drawable.ellipse,R.drawable.ellipse,
        R.drawable.ellipse
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListAdapter = ListViewAdapter(this,name,score,imageId)
        val userList = findViewById<ListView>(R.id.userlist);
        userList.adapter = myListAdapter

    }


}



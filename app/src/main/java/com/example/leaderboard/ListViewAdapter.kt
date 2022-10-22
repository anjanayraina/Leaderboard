package com.example.leaderboard

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(private val context: Activity, private val name: Array<String>, private val score: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.player_view, name) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.player_view, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.description) as TextView

        titleText.text = name[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = score[position]

        return rowView
    }
}
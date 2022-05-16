package com.example.dwight_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.taskRecView)
    }
}

class TaskAdapter : RecyclerView.Adapter<> {

}

class TaskHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
    var nameTW: TextView = itemView.findViewById(R.id.name)
    var timeTW: TextView = itemView.findViewById(R.id.time)
    var severityTW: TextView = itemView.findViewById(R.id.severity)
    var priorityTW: TextView = itemView.findViewById(R.id.priority)

    init {
        itemView.setOnClickListener(this)
    }

    fun bind() {

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}

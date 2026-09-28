package com.example.exp7

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var studentListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        studentListView = findViewById(R.id.studentListView)

        val studentList = listOf(

            Student(
                "Swarupa S",
                "25MCAR0137",
                "MCA",
                "Android Development",
                android.R.drawable.ic_menu_myplaces
            ),

            Student(
                "Rahul Kumar",
                "25MCAR0101",
                "MCA",
                "Database Management",
                android.R.drawable.ic_menu_agenda
            ),

            Student(
                "Ananya Sharma",
                "25MCAR0102",
                "MCA",
                "Web Development",
                android.R.drawable.ic_menu_edit
            ),

            Student(
                "Arjun Rao",
                "25MCAR0103",
                "MCA",
                "Cloud Computing",
                android.R.drawable.ic_menu_upload
            ),

            Student(
                "Priya N",
                "25MCAR0104",
                "MCA",
                "Artificial Intelligence",
                android.R.drawable.ic_menu_search
            ),

            Student(
                "Kiran S",
                "25MCAR0105",
                "MCA",
                "Software Engineering",
                android.R.drawable.ic_menu_manage
            )
        )

        val adapter = StudentAdapter(
            this,
            studentList
        )

        studentListView.adapter = adapter
    }
}
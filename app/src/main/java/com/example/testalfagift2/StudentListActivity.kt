package com.example.testalfagift2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val studentList = listOf(
            Student("John Doe", "123 Elm St", R.drawable.profile1),
            Student("Jane Smith", "456 Oak St", R.drawable.profile1),
            // Add more students as needed
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewStudents)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StudentAdapter(studentList)
    }
}

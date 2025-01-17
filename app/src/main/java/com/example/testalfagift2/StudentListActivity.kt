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
            Student("Budi", "Jakarta", R.drawable.profile1),
            Student("Taufik", "Tangerang", R.drawable.profile1),
            Student("Ratna", "Bogor", R.drawable.profile1),
            Student("Samantha", "Bekasi", R.drawable.profile1),
            Student("Michelle", "Sumatra", R.drawable.profile1),
            Student("Dennis", "Sulawesi", R.drawable.profile1),
            Student("Kevin", "Kalimantan", R.drawable.profile1),
            Student("Micheal", "Pondok Indah", R.drawable.profile1),
            Student("Jeannette", "Bengkulu", R.drawable.profile1),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewStudents)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StudentAdapter(studentList)
    }
}

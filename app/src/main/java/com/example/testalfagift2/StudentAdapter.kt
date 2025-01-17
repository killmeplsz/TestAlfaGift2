package com.example.testalfagift2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(private val students: List<Student>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.textViewName)
        val address: TextView = view.findViewById(R.id.textViewAddress)
        val profilePicture: ImageView = view.findViewById(R.id.imageViewProfile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.name.text = student.name
        holder.address.text = student.address
        holder.profilePicture.setImageResource(student.profilePicture)
    }

    override fun getItemCount() = students.size
}

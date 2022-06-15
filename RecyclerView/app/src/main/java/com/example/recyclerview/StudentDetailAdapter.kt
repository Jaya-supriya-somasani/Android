package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.RowStudentDetailsBinding

class StudentDetailAdapter : RecyclerView.Adapter<StudentDetailAdapter.Holder>() {

    private val students = arrayListOf<StudentDetails>()

    fun addStudentDetails(student: StudentDetails) {
        students.add(student)
        notifyDataSetChanged()
    }


    fun setStudentList(students: ArrayList<StudentDetails>) {
        this.students.clear()
        this.students.addAll(students)
        notifyDataSetChanged()
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val itemBinding=RowStudentDetailsBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.row_student_details,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val student= students[position]
        holder.itemBinding.nameLabel.text = student.firstName+" "+ student.lastName
    }

    override fun getItemCount(): Int {
     return students.size
    }
}

data class StudentDetails (
    val firstName: String,
    val lastName:String
)
package com.example.exp7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class StudentAdapter(
    private val context: Context,
    private val studentList: List<Student>
) : BaseAdapter() {

    override fun getCount(): Int {
        return studentList.size
    }

    override fun getItem(position: Int): Any {
        return studentList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(
                R.layout.student_list_item,
                parent,
                false
            )

        val imageView =
            view.findViewById<ImageView>(
                R.id.studentImageView
            )

        val nameTextView =
            view.findViewById<TextView>(
                R.id.studentNameTextView
            )

        val usnTextView =
            view.findViewById<TextView>(
                R.id.studentUsnTextView
            )

        val courseTextView =
            view.findViewById<TextView>(
                R.id.studentCourseTextView
            )

        val subjectTextView =
            view.findViewById<TextView>(
                R.id.studentSubjectTextView
            )

        val student = studentList[position]

        imageView.setImageResource(
            student.imageResource
        )

        nameTextView.text = student.name

        usnTextView.text =
            "USN: ${student.usn}"

        courseTextView.text =
            "Course: ${student.course}"

        subjectTextView.text =
            "Subject: ${student.subject}"

        return view
    }
}

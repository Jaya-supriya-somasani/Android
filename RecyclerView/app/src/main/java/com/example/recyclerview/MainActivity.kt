package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        //ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))
        val adapter=StudentDetailAdapter()
        binding.recyclerView.adapter =adapter

//        adapter.addStudentDetails(StudentDetails("jgjgj", "hghjh"))
        adapter.setStudentList(arrayListOf(
            StudentDetails("xbdfx",""),
            StudentDetails("",""),
            StudentDetails("ffdgdf",""),
            StudentDetails("",""),
            StudentDetails("",""),
            StudentDetails("fgfg",""),
        ))

    }
}
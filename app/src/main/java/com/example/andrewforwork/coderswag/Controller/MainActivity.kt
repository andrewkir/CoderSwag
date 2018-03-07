package com.example.andrewforwork.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import com.example.andrewforwork.coderswag.Model.Category
import com.example.andrewforwork.coderswag.R
import com.example.andrewforwork.coderswag.Services.DataService
import com.example.andrewforwork.coderswag.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

    }
}

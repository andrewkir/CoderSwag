package com.example.andrewforwork.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.andrewforwork.coderswag.Model.Category
import com.example.andrewforwork.coderswag.R

/**
 * Created by AndrewForWork on 07.03.2018.
 */
class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {

    val context = context
    val categories = categories

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder
        if(convertView == null){
            holder = ViewHolder()

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder.CategoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.CategoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time")
            categoryView.tag=holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.CategoryImage?.setImageResource(resourceId)
        holder.CategoryName?.text = category.title
        return  categoryView
    }
    private class ViewHolder {
        var CategoryImage: ImageView?=null
        var CategoryName: TextView?=null
    }
}
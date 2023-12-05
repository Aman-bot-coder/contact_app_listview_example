package com.example.contact_static

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(private val context:Activity,private val arrayList:ArrayList<UserData>): ArrayAdapter<UserData>(context,R.layout.contact_item,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view:View = convertView?:LayoutInflater.from(context).inflate(R.layout.contact_item,null)
        val image:ImageView = view.findViewById<ImageView>(R.id.img_view_1)
        val name:TextView = view.findViewById<TextView>(R.id.textView2)
        image.setImageResource(arrayList[position].cImage)
        name.text = arrayList[position].cName
        return view

    }
}
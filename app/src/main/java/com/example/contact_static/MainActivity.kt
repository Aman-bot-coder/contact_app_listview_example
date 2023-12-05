package com.example.contact_static

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList:ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cImage:IntArray = intArrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
        )
        val cName:Array<String> = arrayOf(
            "Aman","Prashant","Mummy","Rooh","chutiya","Shobhit","tanu","Roohaniyat","Sikka","Alvin"
        )
        userArrayList = arrayListOf()
            for(position:Int in cName.indices){
                val contact = UserData(cImage[position],cName[position])
                userArrayList.add(contact)
            }

        val listView = findViewById<ListView>(R.id.listview)
        listView.adapter = Adapter(this,userArrayList)

//        listView.isClick  able = true
//
//        listView.setOnItemClickListener { adapterView, view, i, l ->
//
//        }


    }
}
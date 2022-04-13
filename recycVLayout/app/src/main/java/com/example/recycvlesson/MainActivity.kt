package com.example.recycvlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var data: ArrayList<MyDataClass>
    private lateinit var plant: ArrayList<String>
    private lateinit var plantNam: ArrayList<String>
    private lateinit var plantSp: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plant = arrayListOf("Prunus", "Musa", "Rubus")
        plantNam = arrayListOf("Apricot","Banana", "Blackberry")
        plantSp = arrayListOf("Rosales", "Zingiberales", "Rosales")

        recyclerview = findViewById(R.id.rvRecyclerView)
        data = arrayListOf()
        addDataSet()

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)


    }

    private fun addDataSet() {

        for(i in plant.indices){
            val item = MyDataClass(plant[i], plantNam[i],plantSp[i])
//            data.toMutableList().add(item)
            data.add(item)
//            data = listOf<simpleDataClass>(item)
        }
        val adapter = MyAdapter(data)
        recyclerview.adapter = adapter
//        Log.d("TAG", "works:${rvRecyclerview}")
//        rvRecyclerview.adapter = RViewAdapter(data)
    }
}
package com.example.recycvlesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(private val data: List<myDataClass>) : RecyclerView.Adapter<myAdapter.MyViewHolder>(){


        // var fruitList = List<Fruit>()
//    private lateinit var fruitList : List<Fruit>   // replaced with data argument

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.MyViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_layoutdesign, parent, false)
            return  MyViewHolder(view)
        }

        override fun onBindViewHolder(holder: myAdapter.MyViewHolder, position: Int) {
            holder.aGen.text = data[position].genus
            holder.aName.text = data[position].name
            holder.anOrder.text = data[position].order

        }

        override fun getItemCount(): Int {
            return data.size
        }

        class MyViewHolder (view: View): RecyclerView.ViewHolder(view){

            val aGen: TextView
            val aName: TextView
            val anOrder: TextView

            init{
                aGen = view.findViewById(R.id.tv_genus)
                aName = view.findViewById(R.id.tv_name)
                anOrder = view.findViewById(R.id.tv_order)
            }
        }

    }
package com.syedmohammedyousuf.retrofit_api_call

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_items.view.*

class MyAdapter(val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var id: TextView
        var title: TextView
        var body: TextView

        init {
            id = itemView.cv_id
            title = itemView.cv_title
            body = itemView.cv_body
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = userList[position].id.toString()
        holder.title.text = userList[position].title.toString()
        holder.body.text = userList[position].body.toString()
    }

    override fun getItemCount(): Int {

        return userList.size
    }
}
package com.rps.recyclerviewwithmergeadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rps.recyclerviewwithmergeadapterexample.R
import com.rps.recyclerviewwithmergeadapterexample.models.MyDetail
import kotlinx.android.synthetic.main.item_layout_my_detail.view.*

class MyDetailAdapter(
    private val myDetail: MyDetail
) : RecyclerView.Adapter<MyDetailAdapter.DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_my_detail, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(myDetail)
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: MyDetail) {

            itemView.textViewUser.text = user.name
            itemView.textViewAboutMe.text = user.aboutMe
        }
    }
}
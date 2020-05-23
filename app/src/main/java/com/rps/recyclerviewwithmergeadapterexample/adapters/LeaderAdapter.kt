package com.rps.recyclerviewwithmergeadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rps.recyclerviewwithmergeadapterexample.R
import com.rps.recyclerviewwithmergeadapterexample.models.Leader
import kotlinx.android.synthetic.main.item_layout_user_list.view.*

class LeaderAdapter(private val leaders: ArrayList<Leader>, val userCLickListener:(Leader)->Unit
) : RecyclerView.Adapter<LeaderAdapter.DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_user_list, parent,
                false
            )
        )

    override fun getItemCount(): Int = leaders.size

    override fun onBindViewHolder(holder:DataViewHolder, position: Int) =
        holder.bind(leaders[position],userCLickListener)

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(leader: Leader, userCLickListener: (Leader) -> Unit) {
            itemView.textViewUserName.text = leader.name
            Glide.with(itemView.imageViewAvatar.context).
                load(leader.avatar!!).into(itemView.imageViewAvatar as ImageView)
            itemView.setOnClickListener{(userCLickListener(leader))}

        }
    }
}
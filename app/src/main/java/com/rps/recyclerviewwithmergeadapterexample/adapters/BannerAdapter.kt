package com.rps.recyclerviewwithmergeadapterexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rps.recyclerviewwithmergeadapterexample.R
import com.rps.recyclerviewwithmergeadapterexample.models.Banner
import kotlinx.android.synthetic.main.item_layout_banner.view.*

class BannerAdapter( private val banner: Banner
) : RecyclerView.Adapter<BannerAdapter.DataViewHolder>()  {
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: Banner) {
            Glide.with(itemView.imageViewBanner.context)
                .load(banner.bannerImage)
                .into(itemView.imageViewBanner as ImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_banner, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(banner)

}
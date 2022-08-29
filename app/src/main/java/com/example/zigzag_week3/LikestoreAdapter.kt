package com.example.zigzag_week3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.zigzag_week3.databinding.ItemLikestoreBinding

class LikestoreAdapter :
    RecyclerView.Adapter<LikestoreAdapter.CustomViewHolder>() {

    val likestoreList= arrayListOf<LikeStores>()

    class CustomViewHolder(val binding: ItemLikestoreBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(likestore: LikeStores) = with(binding){
            ivLikestoreImg.setImageResource(likestore.like_store_img)
            tvStorename.text = likestore.like_store_name
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LikestoreAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_likestore, parent, false)
        return CustomViewHolder(ItemLikestoreBinding.bind(view))
    }

    override fun onBindViewHolder(holder: LikestoreAdapter.CustomViewHolder, position: Int) {
        holder.bind(likestoreList[position])
    }

    override fun getItemCount(): Int = likestoreList.size

}
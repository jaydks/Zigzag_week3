package com.example.zigzag_week3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zigzag_week3.databinding.ItemPictureBinding

class PictureAdapter(val pictureList: ArrayList<Pictures>) :
    RecyclerView.Adapter<PictureAdapter.CustomViewHolder>() {
    fun removeData(position: Int) {
        pictureList.removeAt(position)
        notifyItemRemoved(position)
    }

    fun addData(picture: Int) {
        pictureList.add(Pictures(picture))
        notifyItemInserted(pictureList.size)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PictureAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_picture, parent, false)
        return CustomViewHolder(ItemPictureBinding.bind(view))
    }

    override fun onBindViewHolder(holder: PictureAdapter.CustomViewHolder, position: Int) {
        holder.bind(pictureList[position])
    }

    override fun getItemCount(): Int = pictureList.size

    class CustomViewHolder(val binding: ItemPictureBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(picture: Pictures) = with(binding) {
            ivPicture.setImageResource(picture.picture)
        }
    }
}
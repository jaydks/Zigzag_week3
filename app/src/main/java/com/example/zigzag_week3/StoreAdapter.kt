package com.example.zigzag_week3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zigzag_week3.databinding.ItemStoreBinding

class StoreAdapter(val storeList: ArrayList<Stores>) :
    RecyclerView.Adapter<StoreAdapter.CustomViewHolder>() {

    fun removeData(position: Int) {
        storeList.removeAt(position)
        notifyItemRemoved(position)
    }


    fun addData(name: String, color: String, color_img: Int) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return CustomViewHolder(ItemStoreBinding.bind(view))
    }

    override fun onBindViewHolder(holder: StoreAdapter.CustomViewHolder, position: Int) {
        holder.bind(storeList[position])
    }

    override fun getItemCount(): Int = storeList.size

    class CustomViewHolder(val binding: ItemStoreBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(store: Stores) = with(binding) {
            val picturelist = store.pictures
            tvRank.text = store.rank
            ivStoreMain.setImageResource(store.store_main_img)
            tvStoreName.text = store.store_name
            tvStoreAbout.text = store.about_store
            tvCoupon.text = "최대 ${store.coupon}원 쿠폰"
            tvLikenum.text = store.likenum
            binding.rvPicture.layoutManager =
                LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            binding.rvPicture.setHasFixedSize(true)
            binding.rvPicture.adapter = PictureAdapter(picturelist)
        }
    }
}
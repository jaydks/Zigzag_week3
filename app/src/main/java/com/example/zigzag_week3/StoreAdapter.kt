package com.example.zigzag_week3

import android.location.Geocoder.isPresent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zigzag_week3.databinding.ItemStoreBinding

class StoreAdapter :
    RecyclerView.Adapter<StoreAdapter.CustomViewHolder>() {

    private val storeList = arrayListOf<Stores>()
    private val storeCheckBoxStatus = arrayListOf<StoreCheckStatus>()

    private val likeStores = arrayListOf<LikeStores>()


    inner class CustomViewHolder(val binding: ItemStoreBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(store: Stores, storeStatus: StoreCheckStatus) = with(binding) {
            val picturelist = store.pictures1
            val picturelist2 = store.pictures2



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

            binding.rvPicture2.layoutManager =
                LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            binding.rvPicture2.setHasFixedSize(true)
            binding.rvPicture2.adapter = PictureAdapter(picturelist2)


            checkBox.isChecked = storeStatus.isChecked

            checkBox.setOnClickListener {
                storeStatus.isChecked = checkBox.isChecked
                Toast.makeText(
                    it.context,
                    "스토어 이름 : ${store.store_name} \n체크상태 : ${checkBox.isChecked}",
                    Toast.LENGTH_SHORT
                ).show()

                if (checkBox.isChecked) {
                    likeStores.add(LikeStores(store.store_main_img, store.store_name))
                    for (i in 0..adapterPosition) {
                        if (likeStores[i].like_store_name == store.store_name) {
                            Toast.makeText(
                                it.context,
                                "${likeStores[i].like_store_name}",
                                Toast.LENGTH_SHORT
                            ).show()
                            Toast.makeText(it.context, "${likeStores}", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    for (i in 0..adapterPosition) {
                        if (likeStores[i].like_store_name == store.store_name) {
                            likeStores.removeAt(i)
                        }
                        Toast.makeText(it.context, "${likeStores}", Toast.LENGTH_SHORT).show()
                    }
                }


            }

        }
    }


    fun removeData(position: Int) {
        storeList.removeAt(position)
        notifyItemRemoved(position)
    }


    fun addData(
        rank: String,
        store_main_img: Int,
        store_name: String,
        about_store: String,
        coupon: String,
        likenum: String,
        picture1: ArrayList<Pictures>,
        picture2: ArrayList<Pictures>
    ) {
        storeList.add(
            Stores(
                rank,
                store_main_img,
                store_name,
                about_store,
                coupon,
                likenum,
                picture1,
                picture2
            )
        )
        storeCheckBoxStatus.add(StoreCheckStatus((storeList.size - 1), false))
        notifyItemInserted(storeList.size - 1)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StoreAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return CustomViewHolder(ItemStoreBinding.bind(view))
    }

    override fun onBindViewHolder(holder: StoreAdapter.CustomViewHolder, position: Int) {
        holder.bind(storeList[position], storeCheckBoxStatus[position])
    }

    override fun getItemCount(): Int = storeList.size

}
package com.example.zigzag_week3

data class Stores(
    val rank: String,
    val store_main_img: Int,
    val store_name: String,
    val about_store: String,
    val coupon: String,
    val pictures: ArrayList<Pictures>
)
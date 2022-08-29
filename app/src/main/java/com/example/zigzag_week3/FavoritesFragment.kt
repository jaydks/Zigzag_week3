package com.example.zigzag_week3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zigzag_week3.databinding.FragmentFavoritesBinding
import com.example.zigzag_week3.databinding.ItemLikestoreBinding

class FavoritesFragment : Fragment() {

    lateinit var binding: FragmentFavoritesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFavoritesBinding.inflate(inflater, container, false)

        //별 체크한걸 여기 어레이로 받아서 출력
        //별 체크한걸 받아서 add함수로 출력해야할 것 같은데
        //별 체크한걸 다른 어레이에 저장해서 그걸 돌릴 수 잇게 해야할 듯. 그 별 값 저장해서 어레이에 저장해서 어쩌구 출력햇던것처럼


        binding.rvLikestore.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvLikestore.setHasFixedSize(true)

        binding.rvLikestore.adapter = LikestoreAdapter()

        return binding.root


    }




}
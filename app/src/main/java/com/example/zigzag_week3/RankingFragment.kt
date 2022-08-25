package com.example.zigzag_week3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zigzag_week3.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {

    lateinit var binding: FragmentRankingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRankingBinding.inflate(inflater, container, false)

        val storeList = arrayListOf(
            Stores(
                "1", R.drawable.pic_1, "슬로우앤드", "캠퍼스룩·심플베이직", "10,000", "131.9만",
                arrayListOf(
                    Pictures(R.drawable.pic_2),
                    Pictures(R.drawable.pic_3),
                    Pictures(R.drawable.pic_4),
                    Pictures(R.drawable.pic_5)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_6),
                    Pictures(R.drawable.pic_7),
                    Pictures(R.drawable.pic_8),
                    Pictures(R.drawable.pic_9)
                )
            ),
            Stores(
                "2", R.drawable.pic_4, "핫핑", "심플베이직·러블리", "15,000", "130.3만",
                arrayListOf(
                    Pictures(R.drawable.pic_11),
                    Pictures(R.drawable.pic_12),
                    Pictures(R.drawable.pic_13),
                    Pictures(R.drawable.pic_14)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_15),
                    Pictures(R.drawable.pic_16),
                    Pictures(R.drawable.pic_17),
                    Pictures(R.drawable.pic_18)
                )
            ),
            Stores(
                "3", R.drawable.pic_19, "육육걸즈", "심플베이직·러블리", "15,000", "243.8만",
                arrayListOf(
                    Pictures(R.drawable.pic_20),
                    Pictures(R.drawable.pic_21),
                    Pictures(R.drawable.pic_22),
                    Pictures(R.drawable.pic_23)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_24),
                    Pictures(R.drawable.pic_25),
                    Pictures(R.drawable.pic_1),
                    Pictures(R.drawable.pic_2)
                )
            ),
            Stores(
                "4", R.drawable.pic_3, "블랙업", "유니크·심플베이직", "50,000", "119.6만",
                arrayListOf(
                    Pictures(R.drawable.pic_4),
                    Pictures(R.drawable.pic_5),
                    Pictures(R.drawable.pic_6),
                    Pictures(R.drawable.pic_7)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_8),
                    Pictures(R.drawable.pic_9),
                    Pictures(R.drawable.pic_10),
                    Pictures(R.drawable.pic_11)
                )
            ),
            Stores(
                "5", R.drawable.pic_12, "리리앤코", "오피스룩·러블리", "100,000", "91.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_13),
                    Pictures(R.drawable.pic_14),
                    Pictures(R.drawable.pic_15),
                    Pictures(R.drawable.pic_16)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_17),
                    Pictures(R.drawable.pic_18),
                    Pictures(R.drawable.pic_19),
                    Pictures(R.drawable.pic_20)
                )
            ),
            Stores(
                "6", R.drawable.pic_21, "데일리쥬", "캐주얼·심플베이직", "15,000", "81.7",
                arrayListOf(
                    Pictures(R.drawable.pic_22),
                    Pictures(R.drawable.pic_23),
                    Pictures(R.drawable.pic_24),
                    Pictures(R.drawable.pic_25)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_1),
                    Pictures(R.drawable.pic_2),
                    Pictures(R.drawable.pic_3),
                    Pictures(R.drawable.pic_4)
                )
            ),
            Stores(
                "7", R.drawable.pic_5, "고고싱", "심플베이직·러블리", "10,000", "203.6만",
                arrayListOf(
                    Pictures(R.drawable.pic_6),
                    Pictures(R.drawable.pic_7),
                    Pictures(R.drawable.pic_8),
                    Pictures(R.drawable.pic_9)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_10),
                    Pictures(R.drawable.pic_11),
                    Pictures(R.drawable.pic_12),
                    Pictures(R.drawable.pic_13)
                )
            ),
            Stores(
                "8", R.drawable.pic_14, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_15),
                    Pictures(R.drawable.pic_16),
                    Pictures(R.drawable.pic_17),
                    Pictures(R.drawable.pic_18)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_19),
                    Pictures(R.drawable.pic_20),
                    Pictures(R.drawable.pic_21),
                    Pictures(R.drawable.pic_22)
                )
            ),


            Stores(
                "9", R.drawable.pic_15, "베니토", "러블리·오피스룩", "15,000", "75만",
                arrayListOf(
                    Pictures(R.drawable.pic_23),
                    Pictures(R.drawable.pic_24),
                    Pictures(R.drawable.pic_25),
                    Pictures(R.drawable.pic_1)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_2),
                    Pictures(R.drawable.pic_3),
                    Pictures(R.drawable.pic_4),
                    Pictures(R.drawable.pic_5)
                )
            ),

            Stores(
                "10", R.drawable.pic_6, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_7),
                    Pictures(R.drawable.pic_8),
                    Pictures(R.drawable.pic_9),
                    Pictures(R.drawable.pic_10)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_11),
                    Pictures(R.drawable.pic_12),
                    Pictures(R.drawable.pic_13),
                    Pictures(R.drawable.pic_14)
                )
            ),

            Stores(
                "11", R.drawable.pic_15, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_16),
                    Pictures(R.drawable.pic_17),
                    Pictures(R.drawable.pic_18),
                    Pictures(R.drawable.pic_19)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_20),
                    Pictures(R.drawable.pic_21),
                    Pictures(R.drawable.pic_22),
                    Pictures(R.drawable.pic_23)
                )
            ),
            Stores(
                "12", R.drawable.pic_24, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_25),
                    Pictures(R.drawable.pic_1),
                    Pictures(R.drawable.pic_2),
                    Pictures(R.drawable.pic_3)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_4),
                    Pictures(R.drawable.pic_5),
                    Pictures(R.drawable.pic_6),
                    Pictures(R.drawable.pic_7)
                )
            ),

            Stores(
                "13", R.drawable.pic_8, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_9),
                    Pictures(R.drawable.pic_10),
                    Pictures(R.drawable.pic_11),
                    Pictures(R.drawable.pic_12)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_13),
                    Pictures(R.drawable.pic_14),
                    Pictures(R.drawable.pic_15),
                    Pictures(R.drawable.pic_16)
                )
            ),

            Stores(
                "14", R.drawable.pic_17, "라룸", "모던시크·심플베이직", "30,000", "68.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_18),
                    Pictures(R.drawable.pic_19),
                    Pictures(R.drawable.pic_20),
                    Pictures(R.drawable.pic_21)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_22),
                    Pictures(R.drawable.pic_23),
                    Pictures(R.drawable.pic_24),
                    Pictures(R.drawable.pic_25)
                )
            ),

            Stores(
                "15", R.drawable.pic_2, "슬로우앤드", "캠퍼스룩·심플베이직", "10,000", "131.9만",
                arrayListOf(
                    Pictures(R.drawable.pic_3),
                    Pictures(R.drawable.pic_4),
                    Pictures(R.drawable.pic_5),
                    Pictures(R.drawable.pic_6)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_7),
                    Pictures(R.drawable.pic_8),
                    Pictures(R.drawable.pic_9),
                    Pictures(R.drawable.pic_10)
                )
            ),
            Stores(
                "16", R.drawable.pic_11, "핫핑", "심플베이직·러블리", "15,000", "130.3만",
                arrayListOf(
                    Pictures(R.drawable.pic_12),
                    Pictures(R.drawable.pic_13),
                    Pictures(R.drawable.pic_14),
                    Pictures(R.drawable.pic_15)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_16),
                    Pictures(R.drawable.pic_17),
                    Pictures(R.drawable.pic_18),
                    Pictures(R.drawable.pic_19)
                )
            ),
            Stores(
                "17", R.drawable.pic_20, "육육걸즈", "심플베이직·러블리", "15,000", "243.8만",
                arrayListOf(
                    Pictures(R.drawable.pic_21),
                    Pictures(R.drawable.pic_22),
                    Pictures(R.drawable.pic_23),
                    Pictures(R.drawable.pic_24)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_25),
                    Pictures(R.drawable.pic_1),
                    Pictures(R.drawable.pic_2),
                    Pictures(R.drawable.pic_3)
                )
            ),
            Stores(
                "18", R.drawable.pic_4, "블랙업", "유니크·심플베이직", "50,000", "119.6만",
                arrayListOf(
                    Pictures(R.drawable.pic_5),
                    Pictures(R.drawable.pic_6),
                    Pictures(R.drawable.pic_7),
                    Pictures(R.drawable.pic_8)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_9),
                    Pictures(R.drawable.pic_10),
                    Pictures(R.drawable.pic_11),
                    Pictures(R.drawable.pic_12)
                )
            ),
            Stores(
                "19", R.drawable.pic_13, "리리앤코", "오피스룩·러블리", "100,000", "91.1만",
                arrayListOf(
                    Pictures(R.drawable.pic_14),
                    Pictures(R.drawable.pic_15),
                    Pictures(R.drawable.pic_16),
                    Pictures(R.drawable.pic_17)
                ),
                arrayListOf(
                    Pictures(R.drawable.pic_18),
                    Pictures(R.drawable.pic_19),
                    Pictures(R.drawable.pic_20),
                    Pictures(R.drawable.pic_21)
                )
            )

        )

        binding.rvStore.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvStore.setHasFixedSize(true)

        binding.rvStore.adapter = StoreAdapter(storeList)

        return binding.root
    }


}
package com.example.zigzag_week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.zigzag_week3.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var tab1: LankingFragment
    lateinit var tab2: FavoritesFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tab1 = LankingFragment()
        tab2 = FavoritesFragment()

        supportFragmentManager.beginTransaction().add(R.id.framelayout, tab1).commit()

        binding.tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> replaceView(tab1)
                    1 -> replaceView(tab2)
                }
            }

        })

    }
    private fun replaceView(tab: Fragment){
        var selectedFragment: Fragment? = null
        selectedFragment = tab
        selectedFragment?.let{
            supportFragmentManager.beginTransaction().replace(R.id.framelayout, it).commit()
        }
    }
}
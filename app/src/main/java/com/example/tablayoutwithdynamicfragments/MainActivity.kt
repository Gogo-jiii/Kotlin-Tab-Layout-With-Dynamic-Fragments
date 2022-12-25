package com.example.tablayoutwithdynamicfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter: ViewPagerAdapter? = null
    var data = arrayOf("A", "B", "C")
    var tabTitle = arrayOf("Tab 1", "Tab 2", "Tab 3")
    var icons = intArrayOf(
        R.drawable.ic_android_black_24dp, R.drawable.ic_baseline_access_alarm_24,
        R.drawable.ic_baseline_cloud_24
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ViewPagerAdapter(this, data)
        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager2
        ) { tab, position ->
            tab.text = tabTitle[position]
            tab.setIcon(icons[position])
        }.attach()
    }
}
package com.example.tablayoutwithdynamicfragments

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity, private val data: Array<String>) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = BlankFragment()
        val bundle = Bundle()
        bundle.putString("key", data[position])
        fragment.arguments = bundle
        return fragment
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
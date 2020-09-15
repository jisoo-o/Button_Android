package com.example.button.startApp_1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainFragmentStatePagerAdapter(fm: FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        when(position){
            0->return CalendarFragment()
            1->return MyclosetFragment()
            else->return RecommendFragment()
        }
    }

    override fun getCount(): Int = fragmentCount
}
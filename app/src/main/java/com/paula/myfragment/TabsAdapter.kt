package com.paula.myfragment

import android.icu.text.CaseMap
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabsAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    private val fragmentList = ArrayList<Fragment>()
    private val titlesList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragments(fragment: Fragment, title: String){
        fragmentList.add(fragment)
        titlesList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titlesList[position]
    }
}
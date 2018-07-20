package com.example.tabviewlibrary.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tabviewlibrary.model.FragmentModel;

import java.util.ArrayList;
import java.util.List;

public class CustomFragmentAdapter extends FragmentPagerAdapter {

    List<FragmentModel> fragments=new ArrayList<>();

    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void init(List<FragmentModel> fragments){
        fragments.clear();
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        if(fragments==null)
            return null;

      return fragments.get(position).getFragment();
    }

    @Override
    public int getCount() {
      return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        //  TODO: change the named  of the tabs here
       return fragments.get(position).getTitle();

    }

}

package com.example.tabviewlibrary.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class CustomFragmentAdapter extends FragmentPagerAdapter {

       List<Fragment> fragments=new ArrayList<>();

    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(fragments==null)
            return null;

      return fragments.get(position);
    }


}

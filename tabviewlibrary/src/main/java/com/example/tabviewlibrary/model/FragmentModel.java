package com.example.tabviewlibrary.model;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentModel {
    
    private Fragment fragment;
    private String Title;

    public FragmentModel(Fragment fragment, String title) {
        this.fragment = fragment;
        Title = title;
    }

    
    public Fragment getFragment() {
        return fragment;
    }

    public String getTitle() {
        return Title;
    }


}

package com.example.tabviewlibrary.model;

import android.app.Fragment;

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

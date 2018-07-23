package com.example.ankush.tabview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabviewlibrary.TabView;
import com.example.tabviewlibrary.model.FragmentModel;

public class MainActivity extends TabView {

ViewPager viewPager;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.layout);
       viewPager=findViewById(R.id.viewpager);
       initViewpagerAndTablayout(viewPager);
       addFragment(new FragmentModel(new fragment1(),"tab1"));
       addFragment(new FragmentModel(new fragment2(),"tab2"));

    }



}

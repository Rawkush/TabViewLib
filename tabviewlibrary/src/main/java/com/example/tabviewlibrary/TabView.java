package com.example.tabviewlibrary;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabviewlibrary.adapter.CustomFragmentAdapter;
import com.example.tabviewlibrary.model.FragmentModel;

import java.util.ArrayList;
import java.util.List;

public class TabView extends AppCompatActivity {
private CustomFragmentAdapter adapter;
private List<FragmentModel> fragments;
private ViewPager viewPager;
private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_viewlib12);
        start();
    }


    private void start(){
        fragments=new ArrayList<>();
        initViewpagerAndTablayout();
        initAdapter();
    }

    private void initViewpagerAndTablayout(){
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    public void initViewpagerAndTablayout(ViewPager viewPager){
        this.viewPager=viewPager;
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        initAdapter();
    }
    public void initViewpagerAndTablayout(ViewPager viewPager,TabLayout tabLayout){
        this.viewPager=viewPager;
        this.tabLayout=tabLayout;
        initAdapter();
        addTabs();
    }


    private void initAdapter(){
        adapter = new CustomFragmentAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);
    }

    private void addTabs(){
        tabLayout.setupWithViewPager(viewPager);
    }

    public void addFragment(FragmentModel fragmentModel){
        fragments.add(fragmentModel);
        adapter.notifyDataSetChanged();
    }


}

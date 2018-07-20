package com.example.tabviewlibrary;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabviewlibrary.adapter.CustomFragmentAdapter;
import com.example.tabviewlibrary.model.FragmentModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

private CustomFragmentAdapter adapter;
private List<FragmentModel> fragments;
private ViewPager viewPager;
private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        fragments=new ArrayList<>();
        initViewPager();
        initAdapter();
    }

    public void initViewPager(){
        viewPager=(ViewPager)findViewById(R.id.viewpager);
    }

    private void initAdapter(){
        adapter = new CustomFragmentAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapter);

    }

    public void initTabView(){
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void addFragment(FragmentModel fragmentModel){
        fragments.add(fragmentModel);
        adapter.notifyDataSetChanged();
    }


}

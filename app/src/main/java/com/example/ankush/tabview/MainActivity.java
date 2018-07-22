package com.example.ankush.tabview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabviewlibrary.TabView;
import com.example.tabviewlibrary.model.FragmentModel;

public class MainActivity extends TabView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createTabLayout();
        addFragment(new FragmentModel(new fragment1(),"tab1"));
        addFragment(new FragmentModel(new fragment2(),"tab2"));

    }

    @Override
    public void createTabLayout() {
        setContentView(R.layout.layout);
        init();

    }

    @Override
    public void initViewPager() {
        super.initViewPager();
    }

    @Override
    public void initTabView() {
        super.initTabView();
    }

    @Override
    public void addFragment(FragmentModel fragmentModel) {
        super.addFragment(fragmentModel);
    }
}

package com.example.tabviewlibrary;

import android.arch.lifecycle.ViewModelStoreOwner;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        fragments=new ArrayList<>();
        initAdapter();
    }

private void initAdapter(){
    adapter = new CustomFragmentAdapter(getSupportFragmentManager(), fragments);


}

}

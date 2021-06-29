package com.release.demoapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.release.demoapk.Fragment.FragAdapater;

public class regiterActivty extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiter_activty);

        tab = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tab.addTab(tab.newTab().setIcon(R.drawable.ic_baseline_thumb_down_24));
        tab.addTab(tab.newTab().setText("OLD FRAG"));

        FragAdapater adapater = new FragAdapater(getSupportFragmentManager(),this,tab.getTabCount());

        viewPager.setAdapter(adapater);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));




        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(),true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}
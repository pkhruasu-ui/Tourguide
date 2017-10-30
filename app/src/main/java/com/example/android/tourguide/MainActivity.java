package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.android.tourguide.R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(com.example.android.tourguide.R.id.viewpager);

        CardFragmentAdapter cardAdapter = new CardFragmentAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(cardAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);
    }
}

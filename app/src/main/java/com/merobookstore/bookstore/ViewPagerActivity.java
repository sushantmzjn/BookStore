package com.merobookstore.bookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.merobookstore.bookstore.adapter.ViewPagerAdapter;
import com.merobookstore.bookstore.fragments.LoginFragment;
import com.merobookstore.bookstore.fragments.RegisterFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new LoginFragment(),"Login");
        viewPagerAdapter.addFragment(new RegisterFragment(), "Sign Up");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}

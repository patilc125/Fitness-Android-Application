package com.example.book_infromation.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.example.book_infromation.R;
import com.example.book_infromation.adapters.ViewPageAdapterYoga;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class YogaActivity extends AppCompatActivity {
    private TabLayout tableLayoutHathaYoga;
    private ViewPager2 viewPagerHathaYoga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
         tableLayoutHathaYoga=findViewById(R.id.tabLayoutHathaYoga);
         viewPagerHathaYoga=findViewById(R.id.viewPageHathaYoga);
        ViewPageAdapterYoga adapter= new ViewPageAdapterYoga(getSupportFragmentManager(),getLifecycle());
        viewPagerHathaYoga.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tableLayoutHathaYoga, viewPagerHathaYoga, true, true,new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Hatha Yoga");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }
}
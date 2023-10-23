package com.example.book_infromation.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.book_infromation.fragments.FragmentHathaYoga;

public class ViewPageAdapterYoga extends FragmentStateAdapter {

    public ViewPageAdapterYoga(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment= FragmentHathaYoga.newInstance();
                break;
            default:
                return null;

        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}

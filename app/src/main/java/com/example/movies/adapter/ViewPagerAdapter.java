package com.example.movies.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.movies.Utils.Utils;
import com.example.movies.fragment.MoviesFragment;
import com.example.movies.fragment.PopularFragment;
import com.example.movies.fragment.UpComingFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PopularFragment();
            case 1:
                return new MoviesFragment();
            case 2:
                return new UpComingFragment();
            default:
                return new PopularFragment();
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0: title = Utils.pouplarTab;
            break;
            case 1: title = Utils.moviesTab;
            break;
            case 2: title = Utils.upcomingTab;
            break;
        }
        return title;
    }
}

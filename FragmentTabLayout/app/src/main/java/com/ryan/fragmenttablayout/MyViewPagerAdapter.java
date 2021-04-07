package com.ryan.fragmenttablayout;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> arrayListFragment;
    ArrayList<String> arrayListJudul;

    public MyViewPagerAdapter(@NonNull FragmentManager fm, ArrayList<Fragment> arrayListFragment, ArrayList<String> arrayListJudul){
        super(fm);
        this.arrayListFragment =   arrayListFragment;
        this.arrayListJudul = arrayListJudul;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        return arrayListFragment.get(position);
    }

    @Override
    public int getCount(){
        return arrayListFragment.size();
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        return arrayListJudul.get(position);
    }
}


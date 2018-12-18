package com.example.altunmursalov.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class MyTabPagerAdapter extends FragmentStatePagerAdapter {

    private String[] tabarray = new String[]{"WHAT'S NEW", "POPULAR", "FAVORITED"};
    Integer tabnumber = 3;
    public MyTabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                WhatsNew news = new WhatsNew();
                return  news;
            case 1:
                Popular popular = new Popular();
                return popular;
            case 2:
                Favorited favorited = new Favorited();
                return favorited;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}

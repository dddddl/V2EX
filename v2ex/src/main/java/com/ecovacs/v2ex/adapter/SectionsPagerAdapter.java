package com.ecovacs.v2ex.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ecovacs.v2ex.fragment.TopicsFragment;

/**
 * Created by Joker on 2018/3/13.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TopicsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
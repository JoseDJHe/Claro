package com.prueba.myaplications.ui.home.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.prueba.myaplications.ui.home.tabsFragments.ResumenFragment;
import com.prueba.myaplications.ui.home.tabsFragments.SimilaresFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public TabsAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new ResumenFragment();
            case 1:
                return  new SimilaresFragment();
            default:
                return null;
        }

    }
}

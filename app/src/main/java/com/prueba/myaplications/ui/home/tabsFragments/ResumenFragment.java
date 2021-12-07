package com.prueba.myaplications.ui.home.tabsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prueba.myaplications.R;
import com.prueba.myaplications.ui.home.adapters.ResumenAdapter;

public class ResumenFragment extends Fragment {

    ViewPager mViewPager;
    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a7, R.drawable.a4,
            R.drawable.a5, R.drawable.a6};

    ResumenAdapter mViewPagerAdapter;


    public ResumenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_resumen, container, false);

        // Initializing the ViewPager Object
        mViewPager = view.findViewById(R.id.viewPagerMain);
        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ResumenAdapter(this.getContext(), images, this);
        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

        return view;
    }
}
package com.example.assignment_blackcoffer.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.assignment_blackcoffer.InnerFragment.BusinessFragment;
import com.example.assignment_blackcoffer.InnerFragment.MerchantFragment;
import com.example.assignment_blackcoffer.InnerFragment.PersonalFragment;

public class viewPagerAdapter extends FragmentPagerAdapter {
    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PersonalFragment();
        } else if (position == 1) {
            return new BusinessFragment();
        } else {
            return new MerchantFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Personal";
        } else if (position == 1) {
            return "Business";
        } else {
            return "Merchant";
        }
    }
}

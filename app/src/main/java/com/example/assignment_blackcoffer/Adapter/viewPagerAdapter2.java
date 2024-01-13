package com.example.assignment_blackcoffer.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.assignment_blackcoffer.OuterFragment.ChatFragment;
import com.example.assignment_blackcoffer.OuterFragment.ContactsFragment;
import com.example.assignment_blackcoffer.OuterFragment.ExploreFragment;
import com.example.assignment_blackcoffer.OuterFragment.GroupsFragment;
import com.example.assignment_blackcoffer.OuterFragment.NetworkFragment;

public class viewPagerAdapter2 extends FragmentPagerAdapter {
    public viewPagerAdapter2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ExploreFragment();
        } else if (position == 1) {
            return new NetworkFragment();
        } else if (position == 2) {
            return new ChatFragment();
        } else if (position == 3) {
            return new ContactsFragment();
        }else {
            return new GroupsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Explore";
        }else if (position==1){
            return "Network";
        }else if(position == 2){
            return "Chat";
        } else if (position == 3) {
            return "Contacts";
        }else {
            return "Groups";
        }
    }
}

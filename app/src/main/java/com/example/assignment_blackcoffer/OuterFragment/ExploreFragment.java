package com.example.assignment_blackcoffer.OuterFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assignment_blackcoffer.databinding.FragmentExploreBinding;
import com.example.assignment_blackcoffer.Adapter.viewPagerAdapter;


public class ExploreFragment extends Fragment {
    private FragmentExploreBinding binding;


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentExploreBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        viewPagerAdapter adapter = new viewPagerAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tab.setupWithViewPager(binding.viewPager);
        return view;
    }

}
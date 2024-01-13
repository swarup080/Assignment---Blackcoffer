package com.example.assignment_blackcoffer.InnerFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assignment_blackcoffer.R;
import com.example.assignment_blackcoffer.Adapter.RecyclerAdapter;
import com.example.assignment_blackcoffer.Model.UserInfo;
import com.example.assignment_blackcoffer.databinding.FragmentPersonalBinding;

import java.util.ArrayList;


public class PersonalFragment extends Fragment {


    public PersonalFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    FragmentPersonalBinding binding;
    ArrayList<UserInfo> userData = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPersonalBinding.inflate(inflater);
        //Demo Data
        for (int i = 0; i < 25; i++)
            userData.add(new UserInfo("Swarup Sen", "Kolkata", "Student", "Within 2.0 KM", "Coffee", "Business", "Friendship", "Hi community! I am open to new connections \uD83D\uDE0A", "+ INVITE", R.drawable.download));
        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        RecyclerAdapter adapter = new RecyclerAdapter(getContext(), userData);
        binding.recycler.setAdapter(adapter);

        return binding.getRoot();
    }


}
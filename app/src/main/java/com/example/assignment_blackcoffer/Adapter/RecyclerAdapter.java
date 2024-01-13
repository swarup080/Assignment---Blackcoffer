package com.example.assignment_blackcoffer.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment_blackcoffer.R;
import com.example.assignment_blackcoffer.Model.UserInfo;
import com.example.assignment_blackcoffer.databinding.UserDetailsBinding;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    ArrayList<UserInfo> arrayList;

    public RecyclerAdapter(Context context, ArrayList<UserInfo> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.user_details, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        UserInfo userInfo = arrayList.get(position);

        holder.binding.nameUser.setText(userInfo.getName());
        holder.binding.location.setText(userInfo.getAddress());
        holder.binding.occupation.setText(userInfo.getOccupation());
        holder.binding.userDistance.setText(userInfo.getDistance());
        holder.binding.work.setText(userInfo.getWork());
        holder.binding.social.setText(userInfo.getSocial());
        holder.binding.others.setText(userInfo.getOther());
        holder.binding.description.setText(userInfo.getDescription());
        holder.binding.invite.setText(userInfo.getInvite());
        holder.binding.profileImg.setImageResource(userInfo.getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        UserDetailsBinding binding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = UserDetailsBinding.bind(itemView);
        }
    }
}

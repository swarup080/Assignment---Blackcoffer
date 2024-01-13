package com.example.assignment_blackcoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.assignment_blackcoffer.databinding.ActivityRefineBinding;

import java.util.ArrayList;

public class Refine extends AppCompatActivity {
    ActivityRefineBinding binding;
    String words[] = {"Available | Hey Let Us Connect", "Away | Stay Discrete And Watch", "Busy | Do Not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! HELP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRefineBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dropDown();
        seekbar();
    }

    public void dropDown() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, words);
        binding.autoCompleteTextView2.setAdapter(adapter);
        binding.autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(Refine.this, item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void seekbar() {
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                binding.textView2.setText(String.valueOf(progress));

                // Calculate thumb position
                int width = seekBar.getWidth() - seekBar.getPaddingLeft() - seekBar.getPaddingRight();
                int thumbPos = seekBar.getPaddingLeft() + width * progress / seekBar.getMax();

                // Calculate text position
                int txtW = binding.textView2.getMeasuredWidth();
                int delta = txtW / 2;
                int newX = (int) (thumbPos - delta + seekBar.getX());

                // Update TextView position
                binding.textView2.setX(newX);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Handle tracking start if needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Handle tracking stop if needed
            }
        });
        binding.seekBar.setProgress(45);
    }

}
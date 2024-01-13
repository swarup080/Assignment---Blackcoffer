package com.example.assignment_blackcoffer;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.assignment_blackcoffer.Adapter.viewPagerAdapter2;
import com.example.assignment_blackcoffer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setIcon(R.drawable.line_horizontal_3_svgrepo_com);
        toggle = new ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close);
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        viewPagerAdapter2 adapter2 = new viewPagerAdapter2(getSupportFragmentManager());
        binding.page.setAdapter(adapter2);
        binding.tabNav.setupWithViewPager(binding.page);
        binding.tabNav.getTabAt(0).setIcon(R.drawable.eye_svgrepo_com);
        binding.tabNav.getTabAt(1).setIcon(R.drawable.network_group_svgrepo_com);
        binding.tabNav.getTabAt(2).setIcon(R.drawable.chat_round_line_svgrepo_com);
        binding.tabNav.getTabAt(3).setIcon(R.drawable.contacts_svgrepo_com);
        binding.tabNav.getTabAt(4).setIcon(R.drawable.hashtag_1_svgrepo_com);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.refine) {
            startActivity(new Intent(this, Refine.class));
        }
        return true;
    }
}
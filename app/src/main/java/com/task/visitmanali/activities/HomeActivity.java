package com.task.visitmanali.activities;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.task.visitmanali.R;
import com.task.visitmanali.fragments.HistoryFragment;
import com.task.visitmanali.fragments.HomeFragment;
import com.task.visitmanali.fragments.PlacesFragment;
import com.task.visitmanali.fragments.WeatherFragment;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bnv = findViewById(R.id.bottomNavBar);
        fl = findViewById(R.id.fragment_container_view);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view, new HomeFragment())
                .commit();

        bnv.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.location_menu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new HomeFragment())
                            .commit();
                    return true;
                case R.id.history_menu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new HistoryFragment())
                            .commit();
                    return true;
                case R.id.explore_menu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new PlacesFragment())
                            .commit();
                    return true;
                case R.id.weather_menu:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container_view, new WeatherFragment())
                            .commit();
                    return true;
                default:
                    return false;
            }
        });
    }
}
package com.task.visitmanali.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.task.visitmanali.R;
import com.task.visitmanali.activities.DetailActivity;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";

    Button exploreBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        exploreBtn = view.findViewById(R.id.explore_btn);

        exploreBtn.setOnClickListener(v -> {
            Bundle bundle = ActivityOptions.makeCustomAnimation(getContext(), android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
            startActivity(new Intent(getContext(), DetailActivity.class), bundle);
        });
        return view;
    }
}
package com.task.visitmanali.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.task.visitmanali.R;
import com.task.visitmanali.adapter.CustomAdapter;
import com.task.visitmanali.model.Places;

import java.util.ArrayList;
import java.util.List;

public class PlacesFragment extends Fragment {
    RecyclerView rv;
    CustomAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_places, container, false);
        rv = view.findViewById(R.id.rv);
        adapter = new CustomAdapter(getContext());
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(adapter);

        return view;
    }
}
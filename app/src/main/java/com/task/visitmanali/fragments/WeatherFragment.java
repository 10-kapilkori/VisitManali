package com.task.visitmanali.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.task.visitmanali.R;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeatherFragment extends Fragment {

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        Calendar calendar = Calendar.getInstance();
        Format f = new SimpleDateFormat("EEEE");
        String date = f.format(new Date());
        String s = calendar.getTime().toString().substring(4, 11);

        TextView tv = view.findViewById(R.id.date);
        tv.setText(date + " " + s);
        return view;
    }
}
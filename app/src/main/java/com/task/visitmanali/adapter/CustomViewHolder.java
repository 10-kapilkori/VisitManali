package com.task.visitmanali.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;
import com.task.visitmanali.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    MaterialTextView placeTitle, placeLocation;
    ImageView placeIv;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        placeTitle = itemView.findViewById(R.id.place_title);
        placeLocation = itemView.findViewById(R.id.place_location);
        placeIv = itemView.findViewById(R.id.place_iv);
    }
}

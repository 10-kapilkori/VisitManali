package com.task.visitmanali.adapter;

import static com.task.visitmanali.model.Places.getPlaceImg;
import static com.task.visitmanali.model.Places.getPlaceLocation;
import static com.task.visitmanali.model.Places.getPlaceTitle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.task.visitmanali.R;
import com.task.visitmanali.model.Places;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    Context context;

    public CustomAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.places_items_list, parent, false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.placeTitle.setText(getPlaceTitle()[position]);
        holder.placeLocation.setText(getPlaceLocation()[position]);

        Glide.with(context)
                .load(getPlaceImg()[position])
                .into(holder.placeIv);
    }

    @Override
    public int getItemCount() {
        return getPlaceTitle().length;
    }
}

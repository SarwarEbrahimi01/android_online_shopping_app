package com.example.onlineshopapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.onlineshopapp.Domain.BannerModel;
import com.example.onlineshopapp.R;

import java.util.ArrayList;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewholder> {
    private ArrayList<BannerModel> sliderItems;
    private ViewPager2 viewPager2;
    private Context context;
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            sliderItems.addAll(sliderItems);
            notifyDataSetChanged();
        }
    };

    public SliderAdapter(ArrayList<BannerModel> sliderItems, ViewPager2 viewPager2) {
        this.sliderItems = sliderItems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderAdapter.SliderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new SliderViewholder(LayoutInflater.from(context).inflate(R.layout.slider_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SliderAdapter.SliderViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SliderViewholder extends RecyclerView.ViewHolder {
        public SliderViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

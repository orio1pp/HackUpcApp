package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.Random;

import Domain.PersistanceController;
import Domain.TechnologyController;

public class AdapterDevices extends RecyclerView.Adapter<AdapterDevices.ViewHolder> {
    int[] images = {R.drawable.mobile1,R.drawable.mobile2,R.drawable.mobile3, R.drawable.mobile4,
            R.drawable.mobile5, R.drawable.mobile6, R.drawable.mobile7, R.drawable.mobile8};
    Context context;
    TechnologyController technologyController = new TechnologyController();
    HashMap<Integer,HashMap<String,String>> data = technologyController.getData();

    public AdapterDevices(Context context, HashMap<Integer,HashMap<String, String>> data ){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.devices_recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Random rand = new Random();
        HashMap<String,String> deviceInfo = data.get(position);
        holder.price.setText(deviceInfo.get("Price"));
        holder.rate.setText(deviceInfo.get("Rate"));
        holder.name.setText(deviceInfo.get("Name"));
        int int_random = rand.nextInt(7);
        holder.image.setImageResource(images[int_random]);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView rate;
        TextView price;
        TextView name;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rate = itemView.findViewById(R.id.rate);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.titol);
            image = itemView.findViewById(R.id.imageView);
        }
    }

}



package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewTechSel extends RecyclerView.Adapter<RecyclerViewTechSel.ViewHolder> {
    private ArrayList<String> data;
    Context context;
    public RecyclerViewTechSel(Context context, ArrayList<String> data ){
        this.data = data;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.tech_selector_recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.button.setText(data.get(position));
        holder.button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch(data.get(holder.getAdapterPosition())) {
                    case "mobile":
                        Intent switchActivityIntent = new Intent(context, FilterView.class);
                        switchActivityIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        context.startActivity(switchActivityIntent);
                        break;
                    case "laptops":
                        System.out.println("Time over");
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Button button;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.buttonType);
        }
    }
}

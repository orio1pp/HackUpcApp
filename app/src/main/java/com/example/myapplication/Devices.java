package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.HashMap;

import Data.Device;
import Domain.TechnologyController;

public class Devices extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterDevices adapterDevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TechnologyController technologyController = new TechnologyController();
        HashMap<Integer, HashMap<String,String>> data = technologyController.getData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyclerViewDevices);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterDevices = new AdapterDevices(this, data);
        recyclerView.setAdapter(adapterDevices);

    }
}
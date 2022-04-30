package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Domain.PersistanceController;

public class SelectTec extends AppCompatActivity {
    //private ControllerSelectTech controllerSelectTech = new ControllerSelectTech();
    RecyclerView recyclerView;
    RecyclerViewTechSel recyclerViewTechSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PersistanceController persistanceController = new PersistanceController();

        try {
            persistanceController.getData(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        persistanceController.convertData();

        ControllerSelectTech controllerSelectTech = new ControllerSelectTech();
        ArrayList<String> types = controllerSelectTech.getTypes();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.reclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTechSet = new RecyclerViewTechSel(this,types);
        recyclerView.setAdapter(recyclerViewTechSet);
    }

    public void changeToSelectedDevice(String tech) {

        Intent switchActivityIntent = new Intent(this, Devices.class);
        switchActivityIntent.putExtra("tech", tech);
        startActivity(switchActivityIntent);

    }
}
package com.example.myapplication;

import static com.google.android.material.internal.ContextUtils.getActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Domain.PersistanceController;

public class SelectTec extends AppCompatActivity {
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

    public void changeView(){
    }

    public void changeToSelectedDevice(String tech) {
        this.getParentActivityIntent();

    }
}
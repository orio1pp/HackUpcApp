package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Domain.PersistanceController;

public class FilterView extends AppCompatActivity {
    ControllerFilter controllerFilter = new ControllerFilter();
    Double test;
    private Context context = this;
    private boolean checkInput(String price, String battery, String memory, String brand){
        try{
            test = Double.parseDouble(price);
            test = Double.parseDouble(battery);
            test = Double.parseDouble(memory);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ControllerFilter controllerFilter = new ControllerFilter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter);
        this.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String price = ((EditText)findViewById(R.id.EditPrice)).getText().toString();
                String battery = ((EditText)findViewById(R.id.EditBattery)).getText().toString();
                String memory =  ((EditText)findViewById(R.id.EditMemory)).getText().toString();
                String brand = ((EditText)findViewById(R.id.EditBrand)).getText().toString();

                price = "2000";
                battery = "2000";
                memory = "2000";
                brand = "xiaomi";
                //if(checkInput(price,battery,memory,brand)){
                    ArrayList<String> filters = new ArrayList<String>();
                    filters.add(price);
                    filters.add(battery);
                    filters.add(memory);
                    filters.add(brand);
                    controllerFilter.selectedFilters(filters);
                    Intent switchActivityIntent = new Intent(context, Devices.class);
                    switchActivityIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    context.startActivity(switchActivityIntent);
                }
               // else Toast.makeText(FilterView.this, "Data incorrectly introduced", Toast.LENGTH_SHORT);
            //}
        });
    }

}

package com.example.myapplication;

import java.util.ArrayList;

import Domain.TechnologyController;

public class ControllerFilter {
    TechnologyController technologyController = new TechnologyController();
    public void selectedFilters(ArrayList<String> selectedFilters){
        technologyController.selectedFilters(selectedFilters);
    }
}

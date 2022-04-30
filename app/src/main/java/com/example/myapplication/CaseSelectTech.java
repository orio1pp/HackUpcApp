package com.example.myapplication;

import java.util.ArrayList;

import Domain.TechnologyController;

public class CaseSelectTech {
    private TechnologyController technologyController = new TechnologyController();
    public ArrayList<String> getTechs(){
        return technologyController.getTypes();
    }
}

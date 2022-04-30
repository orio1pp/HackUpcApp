package com.example.myapplication;

import java.util.ArrayList;

import Domain.TechnologyController;

public class ControllerSelectTech {
    private TechnologyController technologyController = new TechnologyController();
    public ArrayList<String> getTypes(){
        return technologyController.getTypes();
    }

    public void selectedTech(String s) {
        SelectTec selectTec = new SelectTec();
            switch (s){
                case "mobile":
                    selectTec.changeToSelectedDevice("mobile");
                    break;
            }
    }
}

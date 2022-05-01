package Domain;

import java.util.ArrayList;
import java.util.HashMap;

import Data.DataFactory;
import Data.SetTechnology;

public class TechnologyController {
    private SetTechnology setTechnology = DataFactory.getSetTechnology();
    private HashMap<Integer, HashMap<String, String>> Technolgies =  setTechnology.getMap();
    public ArrayList<String> getTypes(){
        return setTechnology.getTypes();
    }
    public void selectedFilters(ArrayList<String> data){
        int i = 0;
        
        for(String filter: data){
             if(!filter.equals("")){
                 FilterStrategy filterS = null;
                 switch(i){
                     case 0:
                         filterS = new FilterPrice();
                         break;
                     case 1:
                         filterS = new FilterBattery();
                         break;
                     case 2:
                         filterS = new FilterMemory();
                         break;
                     case 3:
                         filterS = new FilterCompany();
                         break;
                 }
                 filterS.filter(filter, Technolgies);
             }
             i++;
        }
    }
    public HashMap<Integer, HashMap<String, String>> getData(){
        return this.Technolgies;
    }


}

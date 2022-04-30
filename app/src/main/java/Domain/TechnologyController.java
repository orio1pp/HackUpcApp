package Domain;

import java.util.ArrayList;
import java.util.HashMap;

import Data.DataFactory;
import Data.SetTechnology;

public class TechnologyController {
    private SetTechnology setTechnology = DataFactory.getSetTechnology();
    private HashMap<Integer, HashMap<String, String>> Technolgies =  setTechnology.getMap();
    private HashMap<String, String> selectedTech = new HashMap<String, String>();
    public ArrayList<String> getTypes(){
        return setTechnology.getTypes();
    }

    public HashMap<Integer, HashMap<String, String>> getData(){
        return this.Technolgies;
    }


}

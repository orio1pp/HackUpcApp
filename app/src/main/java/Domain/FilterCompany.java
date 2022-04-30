package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterCompany implements FilterStrategy{
    @Override
    public void filter(String data, HashMap<String, HashMap<String, String>> context) {
        for(Map.Entry<String, HashMap<String,String>> tech: context.entrySet()){
            String brand = tech.getValue().get("Brand");
            if(!brand.equals(data)) context.remove(tech.getKey());
        }
    }
}

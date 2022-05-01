package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterBattery implements FilterStrategy{

    @Override
    public void filter(String data, HashMap<Integer, HashMap<String, String>> context) {
            for(Map.Entry<Integer, HashMap<String,String>> tech: context.entrySet()){
                double battery = Double.parseDouble(tech.getValue().get("Battery"));
                double batteryData = Double.parseDouble(data);
                if(battery<batteryData) context.remove(tech.getKey());
            }
        }
}

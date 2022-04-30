package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterWeight implements FilterStrategy{
    @Override
    public void filter(String data, HashMap<String, HashMap<String, String>> context) {
        for(Map.Entry<String, HashMap<String,String>> tech: context.entrySet()){
            double battery = Double.parseDouble(tech.getValue().get("Weight"));
            double weightData = Double.parseDouble(data);
            if(battery<weightData) context.remove(tech.getKey());
        }
    }
}

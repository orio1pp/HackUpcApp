package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterPrice implements FilterStrategy{
    @Override
    public void filter(String data, HashMap<String, HashMap<String, String>> context) {
        double price = Double.parseDouble(data);
        for(Map.Entry<String, HashMap<String,String>> tech: context.entrySet()){
            double charPrice = Double.parseDouble(tech.getValue().get("Price"));
            if(charPrice>price) context.remove(tech.getKey());
        }
    }
}

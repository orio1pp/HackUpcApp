package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterPrice implements FilterStrategy{
    @Override
    public void filter(String data, HashMap<Integer, HashMap<String, String>> context) {
        Integer price = Integer.parseInt(data);
        for(Map.Entry<Integer, HashMap<String,String>> tech: context.entrySet()){
            if(tech.getValue().get("Price").equals("")) {
                Integer charPrice = Integer.parseInt(tech.getValue().get("Price"));
                if (charPrice > price) context.remove(tech.getKey());
            }
        }
    }
}

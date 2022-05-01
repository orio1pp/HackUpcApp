package Domain;

import java.util.HashMap;
import java.util.Map;

public class FilterMemory implements FilterStrategy{
    @Override
    public void filter(String data, HashMap<Integer, HashMap<String, String>> context) {
        for (Map.Entry<Integer, HashMap<String, String>> tech : context.entrySet()) {
            double memory = Double.parseDouble(tech.getValue().get("Memory"));
            double memoryData = Double.parseDouble(data);
            if (memory < memoryData) context.remove(tech.getKey());
        }
    }
}

package Domain;

import java.util.HashMap;

public interface FilterStrategy {
    public void filter(String data, HashMap<Integer, HashMap<String, String>> context);
}

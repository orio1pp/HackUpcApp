package Data;

import java.util.ArrayList;
import java.util.HashMap;

public interface TechnologyAdapter {
    public boolean setTechnologies(String data);
    public Technology getTechnology(String id);
    public ArrayList<String> getTypes();
    public HashMap<String, HashMap<String, String>> getMap ();
}

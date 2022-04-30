package Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SetTechnology implements TechnologyAdapter{
    private HashMap<String, Technology> technologies = new HashMap<String,Technology>();
    private ArrayList<String> typesTech = new ArrayList<String>();

    public SetTechnology() {
        this.typesTech.add("mobile");
        this.typesTech.add("laptops");
    }

    @Override
    public boolean setTechnologies(String data) {
        return false;
    }

    @Override
    public Technology getTechnology(String id) {
        return technologies.get(id);
    }

    @Override
    public ArrayList<String> getTypes() {
        return typesTech;
    }

    @Override
    public HashMap<String, HashMap<String, String>> getMap() {
        HashMap<String, HashMap<String, String>> techs = new HashMap<String, HashMap<String,String>>();
        for (Map.Entry<String, Technology> tech : technologies.entrySet()) {
            HashMap<String, String> charact = new HashMap<>();
            Mobile mobile = (Mobile) tech.getValue();
            charact.put("Battery", mobile.getBattery());
            charact.put("Bluetooth", mobile.getBluetooth());
            charact.put("FastCharge", mobile.getFashCharge());
            charact.put("ScreenSize", mobile.getScreenSize());
            charact.put("Image", mobile.getImage());
            charact.put("Price", mobile.getPrice());
            charact.put("Camera", mobile.getCamera());
            charact.put("FrontalCamera", mobile.getFrontalCam());
            charact.put("Sim", mobile.getSim());
            charact.put("Wifi", mobile.getWifi());
            charact.put("Rate", mobile.getRate());
            charact.put("Colour", mobile.getColour());
            charact.put("Connections", mobile.getConnections());
            charact.put("DatePublished", mobile.getDatePublished());
            charact.put("Description", mobile.getDescription());
            charact.put("Processor", mobile.getProcessor());
            charact.put("Gpu", mobile.getGpu());
            charact.put("OperatingSystem", mobile.getOperatingSystem());
            charact.put("Refrigeration", mobile.getRefrigeration());
            charact.put("Weight", mobile.getWeight());
            charact.put("Brand", mobile.getBrand());
            techs.put(mobile.getName(), charact);
        }
        return techs;
    }
}

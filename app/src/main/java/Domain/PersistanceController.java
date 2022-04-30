package Domain;

import android.content.Context;

import java.util.ArrayList;

import Persistencia.CSVManager;
import Persistencia.FactoryPersi;

public class PersistanceController {
    private FactoryPersi factoryPersi = new FactoryPersi();
    public void getData(Context context) throws Exception {
        CSVManager csvManager = factoryPersi.getCsvManager();
        ArrayList<ArrayList<String>> data = csvManager.seleccio(context);
        for(ArrayList<String> array : data){
            for(String d : array){
                System.out.println(d);
            }
        }
        System.out.println(data);
    }
}

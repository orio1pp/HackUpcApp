package Domain;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Persistencia.CSVManager;
import Persistencia.FactoryPersi;

public class PersistanceController {
    private static FactoryPersi factoryPersi = new FactoryPersi();
    private static CSVManager csvManager = factoryPersi.getCsvManager();
    public static void getData(Context context) throws Exception {
        csvManager.seleccio(context);
    }
    public static void convertData(){
        csvManager.convertData();
    }
}

package Domain;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Persistencia.CSVManager;
import Persistencia.FactoryPersi;

public class PersistanceController {
    private FactoryPersi factoryPersi = new FactoryPersi();
    private CSVManager csvManager = factoryPersi.getCsvManager();
    public void getData(Context context) throws Exception {
        csvManager.seleccio(context);
    }
    public void convertData(){
        csvManager.convertData();
    }
}

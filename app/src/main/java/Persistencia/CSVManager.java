package Persistencia;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import Data.DataFactory;
import Data.Mobile;
import Data.SetTechnology;

public class CSVManager implements PersisAdapter {
    private CSVLoader cl;
    private File dades;
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    SetTechnology setTechnology = DataFactory.getSetTechnology();
    public CSVManager()
    {
        cl = CSVLoader.getInstance();

        dades = new File("data");
        if (!dades.exists() || !dades.isDirectory()) dades.mkdir();	//It will create the folder if it doesn't exist
    }

    private ArrayList<ArrayList<String>> carregarArxiuCarpeta(InputStream s) throws Exception
    {
        if (dades == null) throw new Exception();
        try
        {
            return cl.carregarArxiu(s);
        } catch (IOException e) {
            throw new Exception("Error al carregar les dades");
        }
    }
    @Override
    public ArrayList<ArrayList<String>> carregarDumpAllCols(Context context) throws Exception
    {
        return carregarArxiuCarpeta(context.getAssets().open("phonedb_device_dump_sample_all_columns.csv"));
    }
    @Override
    public boolean seleccio(Context context) throws Exception
    {
        ArrayList<ArrayList<String>> dades = null;
        try {
            //dades = cp.carregarDump100rows();
            dades = this.carregarDumpAllCols(context);
        } catch (Exception e) { return false;}

        /*
            0 : "Brand"
            1 : "Model"
            25 : "Operating System"
            30 : "CPU"
            33 : "RAM Capacity (MiB RAM)"
            50 : "Resolution"
            92 : "Graphical Controller"
            175 : "NFC"
            281 : "Nominal Cell Capacity (1st cell) (mAh cell)"
            294 : "Wireless Charging"
            198 : "Camera Number of pixels (MP)"
            216 : "Aux. Camera Number of Pixels (MP)"
            248 : "Secondary Camera Number of pixels (MP)"
            168 : "Bluetooth"
            172 : "Wireless Services"
        */

        int[] cols = {0, 1, 25, 30, 33, 50, 92, 175, 281, 294, 198, 216, 168, 172};

        ArrayList<ArrayList<String>> tosend = new ArrayList<ArrayList<String>>();
        for (ArrayList<String> a : dades){
            tosend.add(new ArrayList<String>());
            for (int i = 0; i < cols.length; ++i)
                tosend.get(tosend.size()-1).add(a.get(cols[i]));
        }
        data = tosend;
        return true;
    }
    @Override
    public boolean convertData(){
        data.remove(1);
        for(ArrayList<String> device : data){
            Mobile mobile = new Mobile();
            for(int characteris = 0; device.size()>characteris; characteris++){
                String d = device.get(characteris);
                switch(characteris){
                    case 0 :
                        mobile.setName(d);
                        break;
                    case 1:
                        mobile.setOperatingSystem(d);
                        break;
                    case 2:
                        mobile.setProcessor(d);
                        break;
                    case 3:
                        mobile.setRam(d);
                        break;
                    case 4:
                        mobile.setResolution(d);
                        break;
                    case 5:
                        mobile.setGpu(d);
                        break;
                    case 6:
                        mobile.setNfc(d);
                        break;
                    case 7:
                        mobile.setBattery(d);
                        break;
                    case 8:
                        mobile.setWifi(d);
                        break;
                    case 9:
                        mobile.setInalambricCharge(d);
                        break;
                    case 10:
                        mobile.setCamera(d);
                        break;
                    case 11:
                        mobile.setFrontalCam(d);
                        break;
                    case 12:
                        mobile.setBluetooth(d);
                        break;
                    case 13:
                        break;
                }
            }
            setTechnology.setTechnology(mobile);
        }
        return true;
    }
}

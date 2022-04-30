package Persistencia;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CSVManager implements PersisAdapter {
    private CSVLoader cl;
    private File dades;

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
    public ArrayList<ArrayList<String>> seleccio(Context context) throws Exception
    {
        ArrayList<ArrayList<String>> dades = null;
        try {
            //dades = cp.carregarDump100rows();
            dades = this.carregarDumpAllCols(context);
        } catch (Exception e) {System.out.println("You are stupid");}

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

        return tosend;

    }
}

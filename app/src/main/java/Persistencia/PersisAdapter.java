package Persistencia;

import android.content.Context;

import java.util.ArrayList;

public interface PersisAdapter {
    public ArrayList<ArrayList<String>> carregarDumpAllCols(Context context) throws Exception;
    public ArrayList<ArrayList<String>> seleccio(Context context) throws Exception;
}

package Persistencia;

public class FactoryPersi {
    private CSVManager csvManager = new CSVManager();
    public CSVManager getCsvManager(){return csvManager;}

}

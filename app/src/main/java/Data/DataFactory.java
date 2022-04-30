package Data;

public class DataFactory {
    private static DataFactory dataFactory = null;
    private static SetTechnology setTechnology = new SetTechnology();
    private DataFactory(){
    }
    public static SetTechnology getSetTechnology(){
        return setTechnology;
    }
    public static DataFactory getDataFactory(){
        if(dataFactory == null){
            dataFactory = new DataFactory();
        }
        return dataFactory;
    }

}

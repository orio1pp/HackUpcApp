package Data;

import java.util.ArrayList;

public class Processor {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumCores() {
        return NumCores;
    }

    public void setNumCores(String numCores) {
        NumCores = numCores;
    }

    public String getTheradsCore() {
        return TheradsCore;
    }

    public void setTheradsCore(String theradsCore) {
        TheradsCore = theradsCore;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public double getClockFreq() {
        return clockFreq;
    }

    public void setClockFreq(double clockFreq) {
        this.clockFreq = clockFreq;
    }

    public int getNmTechn() {
        return nmTechn;
    }

    public void setNmTechn(int nmTechn) {
        this.nmTechn = nmTechn;
    }

    public int getNumCaches() {
        return numCaches;
    }

    public void setNumCaches(int numCaches) {
        this.numCaches = numCaches;
    }

    public ArrayList<Cache> getCaches() {
        return caches;
    }

    public void setCaches(ArrayList<Cache> caches) {
        this.caches = caches;
    }

    public Processor(String name, String numCores, String theradsCore, String performance, double clockFreq, int nmTechn, int numCaches, ArrayList<Cache> caches) {
        this.name = name;
        NumCores = numCores;
        TheradsCore = theradsCore;
        this.performance = performance;
        this.clockFreq = clockFreq;
        this.nmTechn = nmTechn;
        this.numCaches = numCaches;
        this.caches = caches;
    }

    public class Cache{
        private String numCache;
        private String Frequ;

        public Cache(String numCache, String frequ) {
            this.numCache = numCache;
            Frequ = frequ;
        }

        public String getNumCache() {
            return numCache;
        }

        public void setNumCache(String numCache) {
            this.numCache = numCache;
        }

        public String getFrequ() {
            return Frequ;
        }

        public void setFrequ(String frequ) {
            Frequ = frequ;
        }
    }

    private String name;
    private String NumCores;
    private String TheradsCore;
    private String performance;
    private double clockFreq;
    private int nmTechn;
    private int numCaches;
    private ArrayList<Cache> caches = new ArrayList<Cache>();
}

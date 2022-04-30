package Data;

public class Ram {
    private String name;
    private double memorySize;
    private double freq;
    private double slots;
    private String typeD;
    private String refrigeration;
    private double latency;

    public Ram(String name, double memorySize, double freq, double slots, String typeD, String refrigeration, double latency) {
        this.name = name;
        this.memorySize = memorySize;
        this.freq = freq;
        this.slots = slots;
        this.typeD = typeD;
        this.refrigeration = refrigeration;
        this.latency = latency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public double getSlots() {
        return slots;
    }

    public void setSlots(double slots) {
        this.slots = slots;
    }

    public String getTypeD() {
        return typeD;
    }

    public void setTypeD(String typeD) {
        this.typeD = typeD;
    }

    public String getRefrigeration() {
        return refrigeration;
    }

    public void setRefrigeration(String refrigeration) {
        this.refrigeration = refrigeration;
    }

    public double getLatency() {
        return latency;
    }

    public void setLatency(double latency) {
        this.latency = latency;
    }
}

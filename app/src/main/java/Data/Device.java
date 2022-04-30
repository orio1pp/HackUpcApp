package Data;

public class Device extends Technology {
    private String processor;
    private String ram;
    private String MainMemory;
    private String refrigeration;
    private String Connections;
    private String OperatingSystem;
    private String Gpu;

    public Device(){
        super();
    }
    public Device(String processor, String ram, String mainMemory, String refrigeration, String connections, String operatingSystem, String gpu,
    String name, String price, String rate, String datePublished, String colour, String description, String image, String weight, String brand) {
        super(name, price, rate, datePublished, colour, description, image, weight, brand);
        this.processor = processor;
        this.ram = ram;
        MainMemory = mainMemory;
        this.refrigeration = refrigeration;
        Connections = connections;
        OperatingSystem = operatingSystem;
        Gpu = gpu;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMainMemory() {
        return MainMemory;
    }

    public void setMainMemory(String mainMemory) {
        MainMemory = mainMemory;
    }

    public String getRefrigeration() {
        return refrigeration;
    }

    public void setRefrigeration(String refrigeration) {
        this.refrigeration = refrigeration;
    }

    public String getConnections() {
        return Connections;
    }

    public void setConnections(String connections) {
        Connections = connections;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getGpu() {
        return Gpu;
    }

    public void setGpu(String gpu) {
        Gpu = gpu;
    }
}

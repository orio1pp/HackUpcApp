package Data;

public class Mobile extends Device{
    private String battery;
    private String screenSize;
    private String bluetooth;
    private String Wifi;
    private String nfc;
    private String inalambricCharge;
    private String FashCharge;
    private String nits;
    private String Sim;
    private String FrontalCam;
    private String Camera;


    private String resolution;

    public Mobile(String battery, String screenSize, String bluetooth, String wifi, String nfc, String inalambricCharge, String fashCharge, String nits, String sim, String frontalCam, String camera,
                  String name, String price, String rate, String datePublished, String colour, String description, String image, String weight, String brand,
                  String processor, String ram, String mainMemory, String refrigeration, String connections, String operatingSystem, String gpu, String resolution) {
        super(processor, ram, mainMemory, refrigeration, connections, operatingSystem, gpu, name, price, rate, datePublished, colour, description, image, weight, brand);
        this.battery = battery;
        this.screenSize = screenSize;
        this.bluetooth = bluetooth;
        Wifi = wifi;
        this.nfc = nfc;
        this.inalambricCharge = inalambricCharge;
        FashCharge = fashCharge;
        this.nits = nits;
        Sim = sim;
        FrontalCam = frontalCam;
        this.resolution = resolution;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getWifi() {
        return Wifi;
    }

    public void setWifi(String wifi) {
        Wifi = wifi;
    }

    public String isNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String isInalambricCharge() {
        return inalambricCharge;
    }

    public void setInalambricCharge(String inalambricCharge) {
        this.inalambricCharge = inalambricCharge;
    }

    public String getFashCharge() {
        return FashCharge;
    }

    public void setFashCharge(String fashCharge) {
        FashCharge = fashCharge;
    }

    public String getNits() {
        return nits;
    }

    public void setNits(String nits) {
        this.nits = nits;
    }

    public String getSim() {
        return Sim;
    }

    public void setSim(String sim) {
        Sim = sim;
    }

    public String getFrontalCam() {
        return FrontalCam;
    }

    public void setFrontalCam(String frontalCam) {
        FrontalCam = frontalCam;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }
    public String getNfc() {
        return nfc;
    }

    public String getInalambricCharge() {
        return inalambricCharge;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}

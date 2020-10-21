public class MobilePhone extends Product {
    private int batteryCapacity;
    private double cameraInMegapixels;
    private int phoneStock = 0;

    public MobilePhone(int price, String manufacturer, int batteryCapacity, double cameraInMegapixels) {
        super(price,manufacturer);
        this.batteryCapacity = batteryCapacity;
        this.cameraInMegapixels = cameraInMegapixels;
        this.name = "Mobile Phone";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getCameraMp() {
        return cameraInMegapixels;
    }
}

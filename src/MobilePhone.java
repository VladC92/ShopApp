public class MobilePhone extends Product {
    int batteryCapacity;
    double cameraMp;

    public MobilePhone(int price, int productStock, String manufacturer, int batteryCapacity, double cameraMp) {
        super(price, productStock, manufacturer);
        this.batteryCapacity = batteryCapacity;
        this.cameraMp = cameraMp;
    }
}

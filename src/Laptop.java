
public class Laptop extends Product {
    int processorsNumber;
    boolean touchScreen;

    @Override
    public String toString() {
        return manufacturer;
    }


    public Laptop(int price, int productStock, String manufacturer, int processorsNumber, boolean touchScreen) {
        super(price, productStock, manufacturer);
        this.processorsNumber = processorsNumber;
        this.touchScreen = touchScreen;
    }


}


public class Laptop extends Product {

    private int processorsNumber;
    private boolean hasTouchScreen;

    public Laptop(int price, int productStock, String manufacturer, int processorsNumber, boolean hasTouchScreen) {
        super(price, productStock, manufacturer);
        this.processorsNumber = processorsNumber;
        this.hasTouchScreen = hasTouchScreen;
        this.name = "laptop";
    }

    public int getProcessorsNumber() {
        return processorsNumber;
    }

    public boolean hasTouchScreen() {
        return hasTouchScreen;
    }

    @Override
    public String toString() {
        return manufacturer;
    }

}

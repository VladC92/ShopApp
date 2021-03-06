import java.util.Objects;

public class Laptop extends Product {

    private int processorsNumber;
    private boolean hasTouchScreen;
    private int laptopStock = 0;

    public int getLaptopStock() {
        return laptopStock;
    }

    public Laptop(int price, String manufacturer, int processorsNumber, boolean hasTouchScreen) {
        super(price, manufacturer);
        this.processorsNumber = processorsNumber;
        this.hasTouchScreen = hasTouchScreen();
        this.name = "laptop";
    }

    public int getProcessorsNumber() {
        return processorsNumber;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public boolean hasTouchScreen() {
        return hasTouchScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return processorsNumber == laptop.processorsNumber &&
                hasTouchScreen == laptop.hasTouchScreen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(processorsNumber, hasTouchScreen);
    }

    @Override
    public String toString() {
        return manufacturer;
    }

}

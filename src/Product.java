
public class Product {
    protected int laptops = 0;
    protected int mobilePhones = 0;
    protected int tvs = 0;
    protected String name;
    protected int price;
    protected String manufacturer;

    public Product(int price, String manufacturer) {
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getLaptopStock() {
        return laptops;
    }

    public int getMobilePhoneStock() {
        return mobilePhones;
    }

    public int getTvStock() {
        return tvs;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }
}

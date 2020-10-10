
public class Product  {
    protected String name;
    protected int price;
    protected int productStock;
    protected String manufacturer;

    public Product(int price, int productStock, String manufacturer) {
        this.price = price;
        this.productStock = productStock;
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getProductStock() {
        return productStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }
}

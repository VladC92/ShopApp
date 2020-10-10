public class Tv extends Product {
    int height;
    boolean smart;

    public Tv(int price, int productStock, String manufacturer, int height, boolean smart) {
        super(price, productStock, manufacturer);
        this.height = height;
        this.smart = smart;
        this.name = "tv";
    }
}

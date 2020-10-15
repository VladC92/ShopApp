public class Tv extends Product {
    int height;
    boolean smart;

    public Tv(int price, String manufacturer, int height, boolean smart) {
        super(price, manufacturer);
        this.height = height;
        this.smart = smart;
        this.name = "tv";
    }
}

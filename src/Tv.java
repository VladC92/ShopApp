public class Tv extends Product {
    private int height;
    private boolean smart;
    private int tvStock = 0;

    public Tv(int price, String manufacturer, int height, boolean smart) {
        super(price, manufacturer);
        this.height = height;
        this.smart = smart;
        this.name = "tv";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}

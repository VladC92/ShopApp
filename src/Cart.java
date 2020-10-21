import java.util.*;

public class Cart {

    private final List<Product> productCart;
    private final Date registrationDate;
    private final Date birthday;
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    Date timeZone = gregorianCalendar.getTime();
    int year = gregorianCalendar.getWeekYear();

    public Cart(Date registrationDate, Date birthday) {
        productCart = new ArrayList<>();
        this.registrationDate = registrationDate;
        this.birthday = birthday;
    }

    public boolean removeProduct(String productName) {
        for (Iterator<Product> it = productCart.iterator(); it.hasNext(); ) {
            Product next = it.next();
            if (next.getName().equals(productName)) {
                it.remove();
                return true;
            }else if (productCart.isEmpty()){
                System.out.println("Your cart is empty");
            }
        }
        return false;
    }

    public void clear() {
        productCart.clear();
    }

    @Override
    public String toString() {
        return "Cart " +
                "productCart = " + productCart +
                ", registrationDate = "  + registrationDate +
                ", birthday = "  + birthday +
                ", timeZone = " + timeZone +
                ", year = " + year ;
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < productCart.size(); i++) {
            sum += productCart.get(i).getPrice();
            if (registrationDate.getTime() < 2018) {
                sum /= 10;
            } else if (birthday.equals(timeZone) && registrationDate.getTime() < 2018) {
                sum /= 15;
            }
        }
        //if anul inregistrarii < 2018, apply 10% discount
        //if data nasterii are luna si ziua == 'azi', apply additional 5% discount
        return sum;

    }
}

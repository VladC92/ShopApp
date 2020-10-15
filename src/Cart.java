import java.util.*;

public class Cart {

    private final List<Product> productCart;
    //anul inregistrarii clientului de care apartine cosul
    private final Date registrationDate;
    //data nasterii fiecarui client de care apartine cosul
    private final Date birthday;
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    Date timeZone = gregorianCalendar.getTime();
    int year = gregorianCalendar.getWeekYear();

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

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
            }
        }
        return false;
    }

    public void clear() {
        productCart.clear();
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < productCart.size(); i++) {
            sum += productCart.get(i).getPrice();
            if (registrationDate.getTime() < 2018) {
                sum /= 10;
            }else if(birthday.equals(timeZone)  && registrationDate.getTime() < 2018) {
                sum /= 15;
            }
        }
        //if anul inregistrarii < 2018, apply 10% discount
        //if data nasterii are luna si ziua == 'azi', apply additional 5% discount
        return sum;

    }

    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Date timeZone = gregorianCalendar.getTime();
        int year = gregorianCalendar.getWeekYear();
        System.out.println(year);
    }

}

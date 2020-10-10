import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Cart {

    private final List<Product> productCart;
    //anul inregistrarii clientului de care apartine cosul
    private final Date registrationDate;
    //data nasterii fiecarui client de care apartine cosul
    private final Date birthday;

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
        }
        //if anul inregistrarii < 2018, apply 10% discount
        //if data nasterii are luna si ziua == 'azi', apply additional 5% discount
        return sum;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String adress;
    private double birthDate;
    private int registrationYear;
    public List<Product> getProductCart() {
        return productCart;
    }

    private final List<Product> productCart = new ArrayList<>();




    public String toString () {
        return "Clientul cu numele " + name + " Data nasterii "+ birthDate + " Si adresa " + adress +  " a fost inregistrat";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(double birthDate) {
        this.birthDate = birthDate;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }
    public Client (String name) {
        this.name = name;
    }

    public Client(String name, String adress, double birthDate, int registrationYear) {
        this.name = name;
        this.adress = adress;
        this.birthDate = birthDate;
        this.registrationYear = registrationYear;
    }

}


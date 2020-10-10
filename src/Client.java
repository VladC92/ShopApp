import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private String address;
    private Date birthDate;
    private Date registrationDate;
    private Cart cart;

    public Client(String name, String address, Date birthDate, Date registrationDate) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.cart = new Cart(registrationDate, birthDate);
    }

    public String toString () {
        return "Clientul cu numele " + name + " Data nasterii "+ birthDate + " Si adresa " + address +  " a fost inregistrat";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationYear) {
        this.registrationDate = registrationYear;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Client implements Comparator {
    private String name;
    private String address;
    private Date birthDate;
    private Date registrationDate;
    private Cart cart;
    private  int clientsNumber = 0;

    public Client(String name, String address, Date birthDate, Date registrationDate) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.cart = new Cart(registrationDate, birthDate);
    }

    public String getName() {
        return name;
    }

    public int getClientsNumber() {
        return clientsNumber;
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
    public int compare(Object o1, Object o2) {
        return 0;
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


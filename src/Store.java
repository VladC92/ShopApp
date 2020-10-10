import java.text.SimpleDateFormat;
import java.util.*;

public class Store {
    Scanner scanner = new Scanner(System.in);
    List<Client> clientList = new ArrayList<>();

    public static void main(String[] args) {
        final String ADD_CLIENT = "ADAUGA_CLIENT";
        final String ADD_PRODUCT = "ADAUGA_PRODUS_STOC";
        final String cartAdd = "ADAUGA_PRODUS_COS";
        final String eraseProduct = "STERGE_PRODUS";
        final String eraseAllProduct = "STERGE_TOATE_PRODUSELE";
        final String clientList = "AFISARE_CLIENTI";
        final String showCart = "AFISARE_COS";
        final String showAll = "AFISARE_COMPLETA";
        final String Exit = "EXIT";
        Store store = new Store();
        Scanner scan = new Scanner(System.in);
        while (true) {
            String command = scan.nextLine();
            if (command.startsWith(ADD_CLIENT)) {
                store.addClient();

            } else if (command.startsWith(ADD_PRODUCT)) {
                System.out.println("Please choose one of the 3 section's we have : laptop , tv or phone");
                store.laptopStock();
                store.tvStock();
                store.mobilePhoneStock();

            } else if (command.startsWith(cartAdd)) {
                store.laptopCartAdd();
                store.tvCartAdd();
                store.phoneCardAdd();

            } else if (command.startsWith(eraseProduct)) {
                store.eraseProduct();

            } else if (command.startsWith(eraseAllProduct)) {
                store.eraseAllProducts();

            } else if (command.startsWith(clientList)) {
                store.showClientList();

            } else if (command.startsWith(showCart)) {
                store.cartShow();

            } else if (command.startsWith(showAll)) {
                store.showAll();

            } else if (command.startsWith(Exit)) {
                System.out.println("Bye Bye and thanks for comming");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    void addClient() {
        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Please enter your address : ");
        String address = scanner.nextLine();
        System.out.println("Please enter your birthday : ");
        String birthday = scanner.nextLine();
        Date parsed = null;



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            parsed = simpleDateFormat.parse(birthday);
        } catch (Exception e) {
            System.out.println("data de nastere invalida. incepeti procesul din nou");
            return;
        }

        Date now = new Date();
        System.out.println("am obtinut informatiile");
        System.out.println(" name => " + name);
        System.out.println(" address => " + address);
        System.out.println(" birthday => " + birthday);
        System.out.println(" data inregistrarii => " + now);
        Client client = new Client(name, address, parsed, now);

        if (clientList.contains(client)) {
            System.out.println("Client with name => " + name + " already exists");
        } else {
            clientList.add(client);
            System.out.println("Hello " + client.getName() + ",welcome to our shop ");
        }
    }

    Laptop apple = new Laptop(800, 5, "Apple", 8, true);
    // ADAUGA_PRODUS LAPTOP 800 5 APPLE 8 true
    Laptop samsung = new Laptop(950, 7, "Samsung", 8, true);
    Laptop hp = new Laptop(450, 15, "Hp", 6, false);
    Laptop asus = new Laptop(600, 3, "Asus", 8, false);
    Laptop Acer = new Laptop(400, 8, "Acer", 7, false);
    Tv nei = new Tv(550, 5, "Nei", 138, false);
    Tv samsungTv = new Tv(1230, 5, "Samsung", 160, true);
    Tv sony = new Tv(1500, 3, "Sony", 180, true);
    Tv appleTv = new Tv(1300, 5, "Apple", 180, true);
    Tv philips = new Tv(350, 8, "Philips", 160, true);
    MobilePhone iphone = new MobilePhone(900, 7, "Apple", 5800, 9.8);
    MobilePhone samsungPhone = new MobilePhone(950, 10, "Samsung", 6300, 9);
    MobilePhone huawey = new MobilePhone(850, 5, "Huawey", 6500, 12);
    MobilePhone motorola = new MobilePhone(350, 5, "Motorola", 7500, 5);
    MobilePhone nokia = new MobilePhone(550, 4, "Nokia", 8000, 3);
    MobilePhone sonyEricsson = new MobilePhone(300, 10, "Sony", 4500, 4);

    void laptopStock() {
        if (scanner.nextLine().startsWith("laptop")) {
            System.out.println("Down below you can see the laptop's stock number : ");
            System.out.println("Apple  = " + apple.productStock);
            System.out.println("Samsung  = " + samsung.productStock);
            System.out.println("Hp  = " + hp.productStock);
            System.out.println("Asus  = " + asus.productStock);
            System.out.println("Acer  = " + Acer.productStock);
        } else {
            System.out.println("Unkown command");
        }
    }

    void tvStock() {
        if (scanner.nextLine().startsWith("tv")) {
            System.out.println("Down below you can see the Tv's stock number : ");
            System.out.println("Nei  = " + nei.productStock);
            System.out.println("Samsung  = " + samsungTv.productStock);
            System.out.println("Sony  = " + sony.productStock);
            System.out.println("Apple  = " + appleTv.productStock);
            System.out.println("Philips  = " + philips.productStock);
        } else {
            System.out.println("Unknown command");
        }
    }

    void mobilePhoneStock() {
        if (scanner.nextLine().startsWith("phone")) {
            System.out.println("Down below you can see the Phone's stock number : ");
            System.out.println("Iphone  = " + iphone.productStock);
            System.out.println("Samsung  = " + samsungPhone.productStock);
            System.out.println("Huaway  = " + huawey.productStock);
            System.out.println("Sony  = " + sonyEricsson.productStock);
            System.out.println("Nokia  = " + nokia.productStock);
        } else {
            System.out.println("Unknown command");
        }
    }

    void laptopCartAdd() {

    }

    void tvCartAdd() {
        for (Client client : clientList) {

        }
    }

    void phoneCardAdd() {
        for (Client client : clientList) {

        }
    }

    void eraseProduct(String clientName, String productNameToErase) {
        for (Client client : clientList) {
            if (client.getName().equals(clientName)) {
                //am gasit clientul din cosul caruia trebuie sa sterg produsul
                client.getCart().removeProduct(productNameToErase);
            }
        }
    }

    void eraseAllProducts(String clientName) {
        for (Client client : clientList) {
            if (client.getName().equals(clientName)) {
                //am gasit clientul din cosul caruia trebuie sa sterg produsul
                client.getCart().clear();
            }
        }
    }

    void showClientList() {
        for (Client client : clientList) {
            System.out.println(client.getName() + client.getRegistrationDate() + client.getProductCart());
        }
    }

    void cartShow() {

    }

    void showAll() {
        for (Client client : clientList) {
            System.out.println("Client name = " + client.getName() + " registration date = " + client.getRegistrationDate() + " the products from your cart = " + client.getProductCart());
        }

    }
}

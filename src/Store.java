import java.util.*;

public class Store extends App {
    Scanner scanner = new Scanner(System.in);
    List<Client> clientList = new ArrayList<>();

    void addClient() {
        Client client = new Client(scanner.nextLine());
            if (clientList.contains(client)) {
                System.out.println("Client already exist");
            } else {
                clientList.add(client);
                System.out.println("Hello " + client.getName() + ",welcome to our shop ");
            }
        }
    Laptop apple = new Laptop(800, 5, "Apple", 8, true);
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
        for (Client client : clientList) {
            boolean clientContain = clientList.contains(client);
            if (scanner.nextLine().startsWith("apple")) {
                client.getProductCart().add(apple);
                System.out.println("The product " + apple + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("samsung")) {
                client.getProductCart().add(samsung);
                System.out.println("The product " + samsung + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("hp")) {
                client.getProductCart().add(hp);
                System.out.println("The product " + hp + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("asus")) {
                client.getProductCart().add(asus);
                System.out.println("The product " + asus + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("acer")) {
                client.getProductCart().add(Acer);
                System.out.println("The product " + Acer + " has been added yo your cart");
            } else {
                System.out.println("Unknown command");
            }
            if (!clientContain) {
                System.out.println("Client does not exist");
            }
        }
    }

    void tvCartAdd() {
        for (Client client : clientList) {
            boolean clientContain = clientList.contains(client);
            if (scanner.nextLine().startsWith("nei")) {
                client.getProductCart().add(nei);
                System.out.println("The product " + nei + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("samsung")) {
                client.getProductCart().add(samsungTv);
                System.out.println("The product " + samsungTv + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("sony")) {
                client.getProductCart().add(sony);
                System.out.println("The product " + sony + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("apple")) {
                client.getProductCart().add(appleTv);
                System.out.println("The product " + appleTv + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("philips")) {
                client.getProductCart().add(philips);
                System.out.println("The product " + philips + " has been added yo your cart");
            } else {
                System.out.println("Unknown command");
            }
            if (!clientContain) {
                System.out.println("Client does not exist");
            }
        }
    }

    void phoneCardAdd() {
        for (Client client : clientList) {
            boolean clientContain = clientList.contains(client);
            if (scanner.nextLine().startsWith("iphone")) {
                client.getProductCart().add(iphone);
                System.out.println("The product " + iphone + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("samsung")) {
                client.getProductCart().add(samsungPhone);
                System.out.println("The product " + samsungPhone + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("huaway")) {
                client.getProductCart().add(huawey);
                System.out.println("The product " + huawey + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("sony")) {
                client.getProductCart().add(sonyEricsson);
                System.out.println("The product " + sonyEricsson + " has been added yo your cart");
            } else if (scanner.nextLine().startsWith("nokia")) {
                client.getProductCart().add(nokia);
                System.out.println("The product " + nokia + " has been added yo your cart");
            } else {
                System.out.println("Unknown command");
            }
            if (!clientContain) {
                System.out.println("Client does not exist");
            }
        }
    }

    void eraseProduct() {
        for (Client client : clientList) {
            System.out.println("Please enter your name and the product you want to erase : ");
            if (clientList.contains(client.getName())) {
                if (client.getProductCart().contains(scanner.nextLine())) {
                    client.getProductCart().remove(scanner.nextLine());
                }
                System.out.println("Your product  has been erased from your cart");
            }
        }
    }

    void eraseAllProducts() {
        for (Client client : clientList) {
            if (clientList.contains(client.getName())) {
                client.getProductCart().clear();
                System.out.println("All your products has been erased");
            }
        }
    }

    void showClientList() {
        for (Client client : clientList) {
            System.out.println(client.getName() + client.getRegistrationYear() + client.getProductCart());
        }
    }

    void cartShow() {

    }

    void showAll() {
        for (Client client : clientList) {
            System.out.println("Client name = " + client.getName() + " registration year = " + client.getRegistrationYear() + " the products from your cart = " + client.getProductCart());
        }

    }
}

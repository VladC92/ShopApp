import java.text.SimpleDateFormat;
import java.util.*;

public class Store {
    Scanner scanner = new Scanner(System.in);
    List<Client> clientList = new ArrayList<>();
    List<Laptop> laptopStock = new ArrayList<>();
    List<MobilePhone> mobilePhoneStock = new ArrayList<>();
    List<Tv> tvStock = new ArrayList<>();


    public static void main(String[] args) {
        final String ADD_CLIENT = "ADAUGA_CLIENT";
        final String ADD_PRODUCTSTOCK = "ADAUGA_PRODUS_STOC";
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
            System.out.println("Please choose one of the following commands from down below : ");
            ;
            System.out.println();
            System.out.println("1.ADAUGA_CLIENT ==> for adding a new client");
            System.out.println("2.ADAUGA_PRODUS_STOC ==> for adding a new product in the store's stock");
            System.out.println("3.ADAUGA_PRODUS_COS ==> for adding a product in client's cart");
            System.out.println("4.STERGE_PRODUS ==> Erase a product from cart");
            System.out.println("5.STERGE_TOATE_PRODUSELE ==> Erase all the products from client's cart");
            System.out.println("6.AFISARE_CLIENTI ==> Show the whole client's list");
            System.out.println("7.AFISARE_COS ==> see the client's cart");
            System.out.println("8.AFISARE_COMPLETA ==> Show all the info");
            System.out.println("0.EXIT ==> Exit ");
            System.out.println("You can use either the letters of the command (only capital letters , ADAUGA_CLIENT) or write the number on the left from every command. ");
            String command = scan.nextLine();
            if (command.startsWith(ADD_CLIENT) || command.startsWith("1")) {
                store.addClient();

            } else if (command.startsWith(ADD_PRODUCTSTOCK) || command.startsWith("2")) {
                System.out.println("Which product would you like to add? laptop,mobile phone or tv : ");
                //aici trebuie sa decizi in functie de ce alege userul
                String productType = scan.nextLine();
                if ("LAPTOP".equalsIgnoreCase(productType)) {
                    //aici adaugi laptop
                } else if ("TV".equalsIgnoreCase(productType)) {
                    //aici tratezi adaugarea de tv
                } // else if mobille phone....
                // else print "produsul X nu este suportat (pentru situatii cand ala tasteaza produs "vapor"
            } else if (command.startsWith(cartAdd) || command.startsWith("3")) {
               //aici e aceeasi poveste
                //trebuie sa primesti de la tastatura numele userului pentru care vrei sa faci add, sa ii zicem X
                //apoi trebuie sa citesti de la tastatura numele produsului pentru care faci add, sa ii zicem Y
                //apoi, cauti in lista de useri, userul cu numele X
                // daca il gasesti, cauti apoi in lista de produse dupa produsul cu numele Y
                // daca il gasesti si acolo, in caruciorul userului X ii adaugi produsul Y
                // trebuie sa ai grija si de "NR DE PRODUSE DIN STOC" (adica produsul Y daca avea 10 bucati pe stoc, acum are 9)
            } else if (command.startsWith(eraseProduct) || command.startsWith("4")) {
                //similar cu ce am scris mai sus la comanda 3
            } else if (command.startsWith(eraseAllProduct) || command.startsWith("5")) {
                store.eraseAllProducts(scan.nextLine());

            } else if (command.startsWith(clientList) || command.startsWith("6")) {
                store.showClientList();

            } else if (command.startsWith(showCart) || command.startsWith("7")) {
                store.cartShow();

            } else if (command.startsWith(showAll) || command.startsWith("8")) {
                store.showAll();

            } else if (command.startsWith(Exit) || command.startsWith("0")) {
                System.out.println("Bye Bye and thanks for coming");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    void addClient() {
        System.out.println("Add a new client");
        System.out.println();
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
            System.out.println("Wrong birthday date, try again");
            return;
        }

        Date now = new Date();
//        System.out.println(" Name => " + name);
//        System.out.println(" Address => " + address);
//        System.out.println(" Birthday => " + birthday);
//        System.out.println(" Registration Date => " + now);
        Client client = new Client(name, address, parsed, now);

        if (clientList.contains(client)) {
            System.out.println("Client => " + name + " already exists");
        } else {
            clientList.add(client);
            System.out.println("Hello " + client.getName() + ",welcome to our shop ");
        }
    }

    void laptopStockAdd() {
        if (scanner.nextLine().startsWith("laptop") || scanner.nextLine().startsWith("Laptop")) {
            System.out.println("Please enter manufacturer : ");
            String manufacturer = scanner.nextLine();
            System.out.println("Please enter the price : ");
            int price = scanner.nextInt();
            System.out.println("Please enter processor number : ");
            int processorsNumber = scanner.nextInt();
            System.out.println("Does the laptop has touchscreen? (Yes or No) : ");
            String answer = scanner.nextLine();
            Laptop laptop = new Laptop(price, manufacturer, processorsNumber, true);
            if (laptopStock.contains(laptop)) {
                System.out.println("This laptop type already exist , will add it to the existent stock ");
                ;
            } else {
                laptopStock.add(laptop);
                System.out.println("The new laptop has been added to the stock");
                int laptopStock = laptop.getLaptopStock();
                laptopStock++;
            }
        } else {
            System.out.println("Unknown command");
        }
    }

    void tvStockAdd() {
        if (scanner.nextLine().startsWith("tv") || scanner.nextLine().startsWith("Tv")) {
            System.out.println("Please enter manufacturer : ");
            String manufacturer = scanner.nextLine();
            System.out.println("Please enter the price : ");
            int price = scanner.nextInt();
            System.out.println("Please enter the height : ");
            int height = scanner.nextInt();
            System.out.println("Is the  Tv smart? (Yes or No) : ");
            String answer = scanner.nextLine();
            Tv tv = new Tv(price , manufacturer , height , true);
        } else {
            System.out.println("Unknown command");
        }
    }

    void mobilePhoneStockAdd() {
        if (scanner.nextLine().startsWith("phone stock")) {
        } else {
            System.out.println("Unknown command");
        }
    }

    void laptopCartAdd() {
        if (scanner.nextLine().startsWith("laptop") || scanner.nextLine().startsWith("Laptop")) {

        } else {
            System.out.println("Unknown command");
        }
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
                System.out.println("Product " + productNameToErase + " from client " + clientName + " , has been erased");
                client.getCart().removeProduct(productNameToErase);
            } else {
                System.out.println("Client or product does not exist");
            }
        }
    }

    void eraseAllProducts(String clientName) {
        for (Client client : clientList) {
            if (client.getName().equals(clientName)) {
                System.out.println("All products from client's " + clientName + " cart,has been erased");
                client.getCart().clear();
            } else {
                System.out.println("Client does not exist");
            }
        }
    }

    void showClientList() {
        for (Client client : clientList) {
            System.out.println(client.getName() + client.getRegistrationDate() + client.getCart());
        }
    }

    void cartShow() {

    }

    void showAll() {
        for (Client client : clientList) {
            if (clientList.contains(client)){
                System.out.println("Client name = " + client.getName() + " registration date = " + client.getRegistrationDate() + " the products from your cart = " + client.getCart());

            }else {
                System.out.println("List is empty");
            }
        }

    }
}

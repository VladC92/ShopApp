import java.text.SimpleDateFormat;
import java.util.*;

public class Store {
    Scanner scanner = new Scanner(System.in);
    List<Client> clientList = new ArrayList<>();
    List<Laptop> laptopStockList = new ArrayList<>();
    List<Tv> tvStockList = new ArrayList<>();
    List<MobilePhone> mobilePhoneList = new ArrayList<>();

    public static void main(String[] args) {
        final String ADD_CLIENT = "ADAUGA_CLIENT";
        final String ADD_PRODUCTSTOCK = "ADAUGA_PRODUS_STOC";
        final String cartAdd = "ADAUGA_PRODUS_COS";
        final String removeProduct = "STERGE_PRODUS";
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
            System.out.println("4.STERGE_PRODUS ==> Remove a product from client's cart (Require client name and product name) ");
            System.out.println("5.STERGE_TOATE_PRODUSELE ==> Remove all the products from client's cart(Require the client name) ");
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
                String productType = scan.nextLine();
                if ("Laptop".equalsIgnoreCase(productType) || "laptop".equalsIgnoreCase(productType)) {
                    System.out.println("Please enter manufacturer : ");
                    String manufacturer = scan.nextLine();
                    System.out.println("Please enter the price : ");
                    int price = scan.nextInt();
                    System.out.println("Please enter processor number : ");
                    int processorsNumber = scan.nextInt();
                    System.out.println("Does the laptop has touchscreen? (Yes or No) : ");
                    String answer = scan.next();
                    Laptop laptop = new Laptop(price, manufacturer, processorsNumber, false);
                    if (answer.startsWith("Yes") || answer.startsWith("yes")) {
                        laptop.setHasTouchScreen(true);
                        answer = "with Touchscreen";
                    } else if (answer.startsWith("No") || answer.startsWith("no")) {
                        answer = "without Touchscreen";
                    }
                    if (store.laptopStockList.contains(laptop)) {
                        int laptopStock = laptop.getLaptopStock();
                        laptopStock++;
                        System.out.println("This product already exists and it has been added counter to the stock");
                    } else {
                        store.laptopStockList.add(laptop);
                    }
                    System.out.println("Details of the product :");
                    System.out.println("-------------------------");
                    System.out.println("Product : " + productType);
                    System.out.println("Manufacturer : " + laptop.getManufacturer());
                    System.out.println("Price : " + laptop.getPrice());
                    System.out.println("Processors : " + laptop.getProcessorsNumber());
                    System.out.println("TouchScreen : " + answer);
                    System.out.println();
                    System.out.println("The new " + manufacturer + " " + productType + " has been added to the stock ");
                } else if ("Tv".equalsIgnoreCase(productType) || "tv".equalsIgnoreCase(productType)) {
                    System.out.println("Please enter manufacturer : ");
                    String manufacturer = scan.nextLine();
                    System.out.println("Please enter the price : ");
                    int price = scan.nextInt();
                    System.out.println("Please enter processor number : ");
                    int height = scan.nextInt();
                    System.out.println("Is the Tv smart? (Yes or No) : ");
                    String answer = scan.next();
                    Tv tv = new Tv(price, manufacturer, height, false);
                    if (answer.startsWith("Yes") || answer.startsWith("yes")) {
                        tv.setSmart(true);
                        answer = "Smart Tv";
                    } else if (answer.startsWith("No") || answer.startsWith("no")) {
                        answer = "Not smart";
                    }
                    tv.setSmart(false);
                    if (store.tvStockList.contains(tv)) {
                        int tvStock = tv.getTvStock();
                        tvStock++;
                        System.out.println("This product already exist and will be added to the existent counter");
                    } else {
                        store.tvStockList.add(tv);
                        System.out.println("The new " + productType + tv.getManufacturer() + " has been added to the stock");
                    }
                    System.out.println("Details of the product : ");
                    System.out.println("-------------------------");
                    System.out.println("Product : " + productType);
                    System.out.println("Manufacturer : " + tv.getManufacturer());
                    System.out.println("Price : " + tv.getPrice());
                    System.out.println("Height : " + tv.getHeight());
                    System.out.println("Smart : " + answer);
                    System.out.println();

                } else if ("Mobile Phone".equalsIgnoreCase(productType) || "mobile phone".equalsIgnoreCase(productType)) {
                    System.out.println("Please enter manufacturer : ");
                    String manufacturer = scan.nextLine();
                    System.out.println("Please enter the price : ");
                    int price = scan.nextInt();
                    System.out.println("Please enter processor number : ");
                    int batteryCapacity = scan.nextInt();
                    System.out.println("Megapixels of the camera : ");
                    double cameraInMegapixels = scan.nextDouble();
                    MobilePhone phone = new MobilePhone(price, manufacturer, batteryCapacity, cameraInMegapixels);
                    if (store.mobilePhoneList.contains(phone)) {
                        int mobilePhoneStock = phone.getMobilePhoneStock();
                        mobilePhoneStock++;
                        System.out.println("This product already exists and it has been added to the existent counter");
                    } else {
                        store.mobilePhoneList.add(phone);
                    }
                    System.out.println("Details of the prduct : ");
                    System.out.println("-------------------------");
                    System.out.println("Product : " + productType);
                    System.out.println("Manufacturer : " + phone.getManufacturer());
                    System.out.println("Price : " + phone.getPrice());
                    System.out.println("Battery Capacity : " + phone.getBatteryCapacity());
                    System.out.println("Camera Megapixels : " + phone.getCameraMp());
                    System.out.println();
                    System.out.println("The new " + productType + phone.getManufacturer() + " has been added to the stock");
                } else {
                    System.out.println("The product you wrote,doesn't exist,try again");
                    return;
                }

            } else if (command.startsWith(cartAdd) || command.startsWith("3")) {
                System.out.println("Please enter your client name and the product you want to add from your cart : ");

                //aici e aceeasi poveste
                //trebuie sa primesti de la tastatura numele userului pentru care vrei sa faci add, sa ii zicem X
                //apoi trebuie sa citesti de la tastatura numele produsului pentru care faci add, sa ii zicem Y
                //apoi, cauti in lista de useri, userul cu numele X
                // daca il gasesti, cauti apoi in lista de produse dupa produsul cu numele Y
                // daca il gasesti si acolo, in caruciorul userului X ii adaugi produsul Y
                // trebuie sa ai grija si de "NR DE PRODUSE DIN STOC" (adica produsul Y daca avea 10 bucati pe stoc, acum are 9)
            } else if (command.startsWith(removeProduct) || command.startsWith("4")) {
                System.out.println("Please enter your client name : ");
                String name = scan.nextLine();
                System.out.println("Now please enter the product name you want to remove");
                String product = scan.nextLine();
                store.removeProduct(name, product);
            } else if (command.startsWith(eraseAllProduct) || command.startsWith("5")) {
                store.removeAllProducts(scan.nextLine());

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
            System.out.println("");
            System.out.println("");
        }

    }

    void removeProduct(String clientName, String productNameToRemove) {
        for (Client client : clientList) {
            if (client.getName().equals(clientName)) {
                Cart cart = client.getCart();
                cart.removeProduct(productNameToRemove);
                if (productNameToRemove.equalsIgnoreCase("tv") || productNameToRemove.equalsIgnoreCase("Tv")) {
                    for (Tv tv : tvStockList) {
                        int tvStock = tv.getTvStock();
                        cart.removeProduct(productNameToRemove);
                        tvStock--;
                        System.out.println("The product has been removed from your cart");
                    }
                } else if (productNameToRemove.equalsIgnoreCase("phone") ||
                        productNameToRemove.equalsIgnoreCase("Phone") || productNameToRemove.equalsIgnoreCase("Mobile phone")) {
                    for (MobilePhone phone : mobilePhoneList) {
                        int mobilePhoneStock = phone.getMobilePhoneStock();
                        cart.removeProduct(productNameToRemove);
                        mobilePhoneStock--;
                        System.out.println("The product has been removed from your cart");
                    }
                } else if (productNameToRemove.equalsIgnoreCase("laptop") || productNameToRemove.equalsIgnoreCase("Laptop")) {
                    for (Laptop laptop : laptopStockList) {
                        int laptopStock = laptop.getLaptopStock();
                        cart.removeProduct(productNameToRemove);
                        laptopStock--;
                        System.out.println("The product has been removed from your cart");
                    }
                }else {
                    System.out.println("Wrong client name or product");
                }
            }
            }
        }

        void removeAllProducts (String clientName){
            for (Client client : clientList) {
                if (client.getName().equals(clientName)) {
                    client.getCart().clear();
                    System.out.println("All products from client's " + clientName + " cart has been removed");
                } else {
                    System.out.println("Client does not exist");
                }
            }
        }

        void showClientList () {
            for (Client client : clientList) {
                System.out.println(client.getName() + client.getRegistrationDate() + client.getCart());
            }
        }

        void cartShow () {

        }

        void showAll () {
            for (Client client : clientList) {
                if (clientList.contains(client)) {
                    System.out.println("Client name = " + client.getName() +
                            " registration date = " + client.getRegistrationDate() +
                            " the products from your cart = " + client.getCart());
                } else {
                    System.out.println("List is empty");
                }
            }

        }
    }

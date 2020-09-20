import java.util.Scanner;

public class App {
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
                System.out.println("Please enter your name : ");
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
}

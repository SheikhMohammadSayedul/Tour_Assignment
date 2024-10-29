import java.util.Scanner;
public class SouvenirShopRunner {
    public static void main(String[] args) {
        Souvenir[] souvenirs = new Souvenir[5];
        souvenirs[0] = new Souvenir("Keychain", 4.99);
        souvenirs[1] = new Souvenir("Magnet", 3.49);
        souvenirs[2] = new Souvenir("T-Shirt", 19.99);
        souvenirs[3] = new Souvenir("Mug", 12.99);
        souvenirs[4] = new Souvenir("Postcard", 1.99);
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Souvenir Shop Menu:");
        for (Souvenir souvenir : souvenirs) {
            System.out.println(souvenir);
        }
        System.out.println("\nEnter the names of the souvenirs you want to buy (type 'done' to finish):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            boolean found = false;
            for (Souvenir souvenir : souvenirs) {
                if (souvenir.getName().equalsIgnoreCase(input)) {
                    cart.addSouvenir(souvenir);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Souvenir not found, please try again.");
            }
        }
        cart.printCart();
        scanner.close();
    }
}


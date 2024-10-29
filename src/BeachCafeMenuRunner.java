import java.util.Scanner;
public class BeachCafeMenuRunner {
    public static void main(String[] args) {
        BeachCafeMenu[] menu = {
                new BeachCafeMenu("Veggie Burger", 7.99, true),
                new BeachCafeMenu("Chicken Sandwich", 8.99, false),
                new BeachCafeMenu("Salad", 5.99, true),
                new BeachCafeMenu("Fish Tacos", 9.99, false),
                new BeachCafeMenu("Fries", 3.49, true),
                new BeachCafeMenu("Grilled Cheese", 6.49, true)
        };
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Beach Cafe Menu:");
        for (BeachCafeMenu item : menu) {
            System.out.println(item);
        }
        System.out.println("\nEnter the names of the items you want to order (type 'done' to finish):");
        double totalCost = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            boolean found = false;
            for (BeachCafeMenu item : menu) {
                if (item.getFoodItem().equalsIgnoreCase(input)) {
                    totalCost += item.getPrice();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Item not found, please try again.");
            }
        }

        System.out.printf("Total cost: $%.2f%n", totalCost);

        System.out.println("\nVegetarian Options:");
        for (BeachCafeMenu item : menu) {
            if (item.isVegetarian()) {
                System.out.println(item);
            }
        }
        scanner.close();
    }
}

import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Souvenir> cart;
    public ShoppingCart() {
        cart = new ArrayList<>();
    }
    public void addSouvenir(Souvenir souvenir) {
        cart.add(souvenir);
    }
    public double getTotalCost() {
        double total = 0;
        for (Souvenir souvenir : cart) {
            total += souvenir.getPrice();
        }
        return total;
    }
    public void printCart() {
        System.out.println("Shopping Cart:");
        for (Souvenir souvenir : cart) {
            System.out.println(souvenir);
        }
        System.out.printf("Total cost: $%.2f%n", getTotalCost());
    }
}

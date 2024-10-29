public class BeachCafeMenu {
    private String foodItem;
    private double price;
    private boolean isVegetarian;

    public BeachCafeMenu(String foodItem, double price, boolean isVegetarian) {
        this.foodItem=foodItem;
        this.price=price;
        this.isVegetarian=isVegetarian;
    }
    public String getFoodItem() {
        return foodItem;
    }
    public double getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    @Override
    public String toString() {
        return foodItem + " - $" + price + (isVegetarian ? " (Vegetarian)" : "");
    }
}

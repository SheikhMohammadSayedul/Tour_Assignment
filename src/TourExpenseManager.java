import java.time.LocalDate;
import java.util.ArrayList;

public class TourExpenseManager {
    private ArrayList<TourExpense> expenses;

    public TourExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(TourExpense expense) {
        expenses.add(expense);
    }

    public double getTotalCost() {
        double total = 0;
        for (TourExpense expense : expenses) {
            total += expense.getCost();
        }
        return total;
    }

    public void printDailyExpenses() {
        for (TourExpense expense : expenses) {
            System.out.println(expense);
        }
    }
}

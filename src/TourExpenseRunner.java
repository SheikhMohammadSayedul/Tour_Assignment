import java.time.LocalDate;

public class TourExpenseRunner {
    public static void main(String[] args) {
        TourExpenseManager manager = new TourExpenseManager();

        // Sample data
        manager.addExpense(new TourExpense("Food", 50.0, LocalDate.of(2023, 6, 25)));
        manager.addExpense(new TourExpense("Transportation", 30.0, LocalDate.of(2023, 6, 25)));
        manager.addExpense(new TourExpense("Accommodation", 100.0, LocalDate.of(2023, 6, 26)));
        manager.addExpense(new TourExpense("Food", 60.0, LocalDate.of(2023, 6, 26)));
        manager.addExpense(new TourExpense("Sightseeing", 40.0, LocalDate.of(2023, 6, 27)));

        // Print daily expenses
        manager.printDailyExpenses();

        // Print total cost
        System.out.println("Total cost of the tour: " + manager.getTotalCost());
    }
}

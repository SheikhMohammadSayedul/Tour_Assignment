import java.time.LocalDate;

public class TourExpense {
    private String expenseType;
    private double cost;
    private LocalDate date;

    public TourExpense(String expenseType, double cost, LocalDate date) {
        this.expenseType = expenseType;
        this.cost = cost;
        this.date = date;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public double getCost() {
        return cost;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Expense Type: " + expenseType + ", Cost: " + cost + ", Date: " + date;
    }
}

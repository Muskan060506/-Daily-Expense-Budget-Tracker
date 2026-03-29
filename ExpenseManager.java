import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();
    private double budget;

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void addExpense(Expense e) {
        expenses.add(e);
        System.out.println("Expense added successfully!");
    }

    public void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public void checkBudget() {
        double total = getTotalExpense();
        System.out.println("Total खर्च: ₹" + total);

        if (total > budget) {
            System.out.println("⚠ Budget exceeded!");
        } else {
            System.out.println("Remaining budget: ₹" + (budget - total));
        }
    }
}

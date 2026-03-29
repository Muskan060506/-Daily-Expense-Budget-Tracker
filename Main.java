import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        System.out.print("Enter your monthly budget: ₹");
        double budget = sc.nextDouble();
        manager.setBudget(budget);

        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Check Budget");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter date: ");
                    String date = sc.nextLine();

                    Expense e = new Expense(category, amount, date);
                    manager.addExpense(e);
                    break;

                case 2:
                    manager.showExpenses();
                    break;

                case 3:
                    manager.checkBudget();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

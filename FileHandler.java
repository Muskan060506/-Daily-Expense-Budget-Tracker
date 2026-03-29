import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public static void saveExpenses(ArrayList<Expense> expenses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("expenses.txt"))) {
            for (Expense e : expenses) {
                writer.println(e);
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}

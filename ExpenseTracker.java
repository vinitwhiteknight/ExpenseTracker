import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("\n✅ Expense added successfully!");
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("\nNo expenses recorded yet.");
            return;
        }
        System.out.println("\n--- All Expenses ---");
        for (Expense exp : expenses) {
            System.out.println(exp.toString());
        }
    }

    public void viewCategoryTotals() {
        if (expenses.isEmpty()) {
            System.out.println("\nNo expenses to calculate.");
            return;
        }

        Map<String, Double> categoryTotals = new HashMap<>();
        
        // Aggregate amounts by category
        for (Expense exp : expenses) {
            String category = exp.getCategory().toUpperCase();
            categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + exp.getAmount());
        }

        System.out.println("\n--- Spending by Category ---");
        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            System.out.printf("%-15s : $%.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
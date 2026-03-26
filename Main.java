import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();
        boolean running = true;

        System.out.println("=====================================");
        System.out.println("  Welcome to the Expense Tracker CLI ");
        System.out.println("=====================================");

        while (running) {
            System.out.println("\n1. Add New Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Spending by Category");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the bad input
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Date (YYYY-MM-DD): ");
                        LocalDate date = LocalDate.parse(scanner.nextLine());
                        
                        System.out.print("Enter Amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        
                        System.out.print("Enter Category (e.g., Food, Rent, Transport): ");
                        String category = scanner.nextLine();
                        
                        System.out.print("Enter Description: ");
                        String desc = scanner.nextLine();

                        tracker.addExpense(new Expense(date, amount, category, desc));
                    } catch (DateTimeParseException e) {
                        System.out.println("❌ Invalid date format. Please use YYYY-MM-DD.");
                    } catch (InputMismatchException e) {
                        System.out.println("❌ Invalid amount. Please enter a numerical value.");
                        scanner.nextLine(); // Clear bad input
                    }
                    break;
                case 2:
                    tracker.viewAllExpenses();
                    break;
                case 3:
                    tracker.viewCategoryTotals();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting tracker. Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option. Please choose 1-4.");
            }
        }
        scanner.close();
    }
}
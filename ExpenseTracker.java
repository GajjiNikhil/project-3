package quiz;
import java.util.ArrayList;
import java.util.Scanner;
public class ExpenseTracker {

	public static void main(String[] args) {
				        Scanner scanner = new Scanner(System.in);
				        ArrayList<Double> expenses = new ArrayList<>();

				        while (true) {
				            System.out.println("Expense Tracker Menu:");
				            System.out.println("1. Add Expense");
				            System.out.println("2. View Total Expenses");
				            System.out.println("3. Exit");
				            System.out.print("Choose an option: ");

				            int choice = scanner.nextInt();

				            switch (choice) {
				                case 1:
				                    System.out.print("Enter expense amount: $");
				                    double expenseAmount = scanner.nextDouble();
				                    expenses.add(expenseAmount);
				                    System.out.println("Expense added successfully!");
				                    break;

				                case 2:
				                    double totalExpenses = 0;
				                    for (double expense : expenses) {
				                        totalExpenses += expense;
				                    }
				                    System.out.println("Total Expenses: $" + totalExpenses);
				                    break;

				                case 3:
				                    System.out.println("Exiting Expense Tracker. Goodbye!");
				                    System.exit(0);
				                    break;

				                default:
				                	
				                    System.out.println("Invalid choice. Please choose a valid option.");
				                 
				            }
				        }
				    }
}
	

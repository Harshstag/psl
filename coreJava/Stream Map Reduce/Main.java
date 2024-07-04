import java.util.*; 
import java.util.stream.*; 

class Main
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Expenses> expenseList = new ArrayList<>();
        String[] expenseTypes = {"food", "rent", "shopping", "groceries", "electricity"};

        for (String type : expenseTypes) {
            System.out.println("Enter expense for " + type);
            double cost = scanner.nextDouble();
            expenseList.add(new Expenses(type, cost));
        }

        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        // Calculate total expenses
        double totalExpenses = expenseList.stream()
                .map(Expenses::getCost)
                .reduce(0.0, Double::sum);

        // Check conditions and print the result
        if (totalExpenses > salary) {
            System.out.println("Expenses exceeds Salary");
        } else {
            double savings = salary - totalExpenses;
            System.out.println("Savings amount will be Rs." + savings);
        }

        scanner.close();
    }
}

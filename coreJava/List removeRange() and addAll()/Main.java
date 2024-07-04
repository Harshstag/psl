import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of user details to be added
        System.out.println("Enter the number of User details to be added");
        int n = Integer.parseInt(scanner.nextLine());

        // Create a UserBO object and populate it with pre-coded user details
        UserBO userList = UserBO.getList();

        // List to hold new users to be added
        List<User> newUserList = new ArrayList<>();

        // Get user details from input and add to the new user list
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the user " + (i + 1) + " detail in csv format");
            String[] userDetails = scanner.nextLine().split(",");
            User user = new User(userDetails[0].trim(), userDetails[1].trim(), userDetails[2].trim(), userDetails[3].trim());
            newUserList.add(user);
        }

        // Add all new users to the UserBO list
        userList.addAll(newUserList);

        // Display header
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");

        // Display the user details
        for (User user : userList) {
            user.display();
        }

        // Get the range to be removed
        System.out.println("Enter the range to be removed from array list");
        int fromIndex = Integer.parseInt(scanner.nextLine());
        int toIndex = Integer.parseInt(scanner.nextLine());

        // Remove users in the specified range
        userList.removeUser(fromIndex, toIndex);

        // Display header again
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");

        // Display the remaining user details
        for (User user : userList) {
            user.display();
        }

        scanner.close();
    }
}

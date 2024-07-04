import java.util.ArrayList;
import java.util.Collection;

public class UserBO extends ArrayList<User> {

    // Method to remove users from index n1 to n2
    public void removeUser(int n1, int n2) {
        // Creating a method to access the protected removeRange method of ArrayList
        removeRange(n1, n2);
    }

    // Static method to return a pre-coded list of users
    public static UserBO getList() {
        UserBO userList = new UserBO();
        userList.add(new User("mohan Raja", "9874563210", "mohan", "mohan@abc.in"));
        userList.add(new User("arjun Ravi", "4324237", "arjun", "arjun@abc.in"));
        userList.add(new User("Arun kumar", "9845671230", "arun", "arun@abc.in"));
        userList.add(new User("prakash raj", "7548921445", "prakash", "raj@abc.in"));
        return userList;
    }

    // Override addAll method to add a collection of users
    @Override
    public boolean addAll(Collection<? extends User> c) {
        return super.addAll(c);
    }
}

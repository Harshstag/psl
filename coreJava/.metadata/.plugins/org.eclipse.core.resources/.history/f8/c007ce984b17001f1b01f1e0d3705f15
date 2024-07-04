import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of users:");
		int n = sc.nextInt();
		sc.nextLine();
		Set<User> userSet = new HashSet<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter details of user" + (i + 1));

			System.out.println("Username:");
			String username = sc.nextLine();

			System.out.println("Bank name:");
			String bankName = sc.nextLine();

			userSet.add(new User(username, bankName));
		}

		System.out.println("Enter username(Expire in one month) seperated by comma");
		String[] activeUsernames = sc.nextLine().split(",");

		List<User> activeUserList = new ArrayList<>();

		for (String username : activeUsernames) {
			activeUserList.add(new User(username, null));
		}

		userSet.retainAll(activeUserList);

		List<User> sortedUserList = new ArrayList<>(userSet);
		Collections.sort(sortedUserList);

		System.out.println("Users going to expire within a month");
		
		int count = 1;
		for (User user : sortedUserList) {
			System.out.println("User " + count);
			System.out.println("User Name = " + user.getUsername());
			System.out.println("Bank Name = " + user.getBankname());
			count++;
		}
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the user details");
		String str = sc.nextLine();
		String[] details = str.split(",");

		try {
			UserBO Bo = new UserBO();
			User user = new User(details[0], details[1], details[2], details[3]);
			Bo.validate(user);

			System.out.println(user);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of users:");
		int numOfUser = sc.nextInt();
		sc.nextLine();

		List<User> userList = new ArrayList<>();

		for (int i = 0; i < numOfUser; i++) {
			System.out.println("Enter the details of user " + (i + 1));
			String[] details = sc.nextLine().split(",");

			userList.add(new User(details[0], details[1], details[2], details[3]));
		}

		System.out.println("Enter the number of cities:");
		int numOfCities = sc.nextInt();
		sc.nextLine();

		List<CityCount> Threads = new ArrayList<>();

		for (int i = 0; i < numOfCities; i++) {
			System.out.println("Enter the name of city " + (i + 1));
			String city = sc.nextLine();

			CityCount cc = new CityCount(city, userList);
			Threads.add(cc);

			cc.start();
		}

		for (CityCount T : Threads) {

			T.join();
			System.out.println(T.getCity() + "--" + T.getCount());

		}

		sc.close();
	}
}

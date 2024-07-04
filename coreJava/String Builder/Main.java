import java.util.*;

public class Main {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of items:");
		int n = sc.nextInt();
		sc.nextLine();

		Item[] I = new Item[n];
		
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");

		for (int i = 0; i < n; i++) {

			String str = sc.nextLine();

			StringBuilder sbtr = new StringBuilder(str);

			String[] details = sbtr.toString().split("\\$");

			int cost = Integer.parseInt(details[2]);
			int availableQuantity = Integer.parseInt(details[3]);

			I[i] = new Item(details[0], details[1], cost, availableQuantity);
		}
		System.out.println("Items:");

		for (int i = 0; i < n; i++) {

			I[i].getData();
		}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

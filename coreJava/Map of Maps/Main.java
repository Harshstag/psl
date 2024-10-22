import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of address:");
		int n = Integer.parseInt(scanner.nextLine());

		Map<String, Map<String, Integer>> stateCityMap = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the address:");
			String[] addressDetails = scanner.nextLine().split(",");
			String area = addressDetails[0].trim();
			String city = addressDetails[1].trim();
			String state = addressDetails[2].trim();
			int pincode = Integer.parseInt(addressDetails[3].trim());

			// Create a new Address object
			Address address = new Address(area, city, state, pincode);

			stateCityMap.putIfAbsent(state, new TreeMap<>());
			Map<String, Integer> cityMap = stateCityMap.get(state);

			cityMap.put(city, cityMap.getOrDefault(city, 0) + 1);
		}
		System.out.println("Number of entries in city/state wise:");

		for (Map.Entry<String, Map<String, Integer>> stateEntry : stateCityMap.entrySet()) {

			String statee = stateEntry.getKey();

			Map<String, Integer> cityMaps = stateEntry.getValue();

			System.out.println();
			System.out.println("State:" + statee);

			for (Map.Entry<String, Integer> cityEntry : cityMaps.entrySet()) {

				String cityy = cityEntry.getKey();
				int count = cityEntry.getValue();
				System.out.println("City:" + cityy + " Count:" + count);

			}

		}

	}
}

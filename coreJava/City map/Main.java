import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of address");
		int n = sc.nextInt();
		sc.nextLine();

		Map<String, List<Address>> cityAddressMap = new HashMap<>();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter the address " + (i+1) + " detail");
			String input = sc.nextLine();
			String[] details =  input.split(",");

			String city = details[2];
			int pincode = Integer.parseInt(details[4]);

			Address ad = new Address(details[0], details[1], city, details[3], pincode);
			cityAddressMap.putIfAbsent(city, new ArrayList<>());
			cityAddressMap.get(city).add(ad);
		}
		
		System.out.println("Enter the city to be searched");
        String searchCity = sc.nextLine();
		
		if(cityAddressMap.containsKey(searchCity)) {
			
			 System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
			 for(Address ad : cityAddressMap.get(searchCity)) {
				 System.out.printf("%-15s %-15s %-15s %-15s %s\n",
	                        ad.getAddressLine1(),
	                        ad.getAddressLine2(),
	                        ad.getCity(),
	                        ad.getState(),
	                        ad.getPincode());
			 }
		}else {
			System.out.println("Searched city not found");
		}

	}

}

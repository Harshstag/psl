package SimpleFileWriteIAsses;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the airport");
		String name = sc.nextLine();
		
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		
		System.out.println("Enter the country code");
		String code = sc.nextLine();
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter("airport.csv"))){
			br.write(name + "," + city + "," + code);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

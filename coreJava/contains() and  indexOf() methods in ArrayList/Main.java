import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> hallList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter the Hall Name " + (i+1));
			String hall = sc.nextLine();
			hallList.add(hall);
		}
		
		System.out.println("Enter the hall name to be searched:");
		String searchHall = sc.nextLine();
		
		if(hallList.contains(searchHall)) {
			
			int pos = hallList.indexOf(searchHall);
			System.out.println( searchHall + " hall is found in the list at position " + pos); 
			
		}else {
			System.out.println( searchHall + " hall is not found");
			
		}
	}
}
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String args[]) throws Exception {

		int choice;
		String details;
		String[] detailsArray;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your choice:");
		System.out.println("1.Exhibition event");
		System.out.println("2.Stage event");
	
		choice = sc.nextInt();
		sc.nextLine();

		if (choice == 1) {

			System.out.println("Enter the details of exhibition:");
			
			details = sc.nextLine();
			detailsArray = details.split(",");

			double costPerDay = Double.parseDouble(detailsArray[4]);
			int noOfStall = Integer.parseInt(detailsArray[5]);

			Exhibition exb = new Exhibition(detailsArray[0], detailsArray[1], detailsArray[2], detailsArray[3],
					costPerDay, noOfStall);

			System.out.println("Enter the starting date of the event:");
			LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

			System.out.println("Enter the ending date of the event:");
			LocalDate endDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			double totalCost = exb.totalCost(startDate, endDate);
		
			double totalGST = exb.totalGST(totalCost);
			
			System.out.println("The GST to be paid is Rs." + totalGST);

		} else {

			System.out.println("Enter the details of stage event:");
			details = sc.nextLine();
			detailsArray = details.split(",");

			double costPerDay = Double.parseDouble(detailsArray[4]);
			int noOfSeats = Integer.parseInt(detailsArray[5]);

			StageEvent se = new StageEvent(detailsArray[0], detailsArray[1], detailsArray[2], detailsArray[3],
					costPerDay, noOfSeats);

			System.out.println("Enter the starting date of the event:");
			LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			System.out.println("Enter the ending date of the event:");
			LocalDate endDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));;
			
			double totalCost = se.totalCost(startDate, endDate);
			
			double totalGST = se.totalGST(totalCost);
			
			System.out.println("The GST to be paid is Rs." + totalGST);
		}
		sc.close();

	}

}

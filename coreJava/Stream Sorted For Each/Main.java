import java.io.*;
import java.util.*;


class Main
{
    public static void main(String args[]) {
    	
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter number of bookings");
        int n = sc.nextInt();
        
        List<TicketBooking> TicketBookingList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	sc.nextLine();
        	
        	System.out.println("Enter customer name");
        	String name = sc.nextLine();
        	
        	System.out.println("Enter number of tickets");
        	int tickets = sc.nextInt();
        	 sc.nextLine();
        	
        	System.out.println("Enter the price");
        	double price  = sc.nextDouble();
        	
        	TicketBooking tk = new TicketBooking(name, tickets, price);
        	TicketBookingList.add(tk);
        	
        }
        
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        
        TicketBookingList.stream().sorted((b1, b2)->b1.getPrice().compareTo(b2.getPrice())).forEach(System.out::println);
    }
}

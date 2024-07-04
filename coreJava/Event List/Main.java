import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Event> eventList = new ArrayList<>();

        System.out.println("Enter the number of events");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        
        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");

        for (int i = 0; i < n; i++) {
            
            String[] eventDetails = scanner.nextLine().split(",");
            String eventName = eventDetails[0];
            String organiserName = eventDetails[1];
            Double eventCost = Double.parseDouble(eventDetails[2]);
            Event event = new Event(eventName, organiserName, eventCost);
            eventList.add(event);
        }

        Event event = new Event();
        event.display(eventList);

        scanner.close();
    }
}
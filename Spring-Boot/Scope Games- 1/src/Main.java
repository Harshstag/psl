


import com.spring.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("org.hibernate");
		log.setLevel(Level.OFF);
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);

        List<Owner> owners = new ArrayList<>();
        List<Event> events = new ArrayList<>();

        System.out.println("Enter the number of owners you want to create");
        int numOwners = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOwners; i++) {
            Owner owner = (Owner) context.getBean("owner");
            System.out.println("Enter the Name and Password of the Owner");
            String name = scanner.nextLine();
            String password = scanner.nextLine();
            owner.setName(name);
            owner.setPassword(password);
            owners.add(owner);
        }

        System.out.println("Enter the number of events you want to create");
        int numEvents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numEvents; i++) {
            Event event = (Event) context.getBean("event");
            System.out.println("Enter the Event name");
            String eventName = scanner.nextLine();
            event.setEventName(eventName);

            System.out.println("Select any option from the list and enter the number");
            for (int j = 0; j < owners.size(); j++) {
                System.out.println((j + 1) + ")" + owners.get(j).getName());
            }
            System.out.println("Enter the choice");
            int choice = Integer.parseInt(scanner.nextLine());
            event.setEventOrganiser(owners.get(choice - 1));
            events.add(event);
        }

        System.out.println("...Listing events...");
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            System.out.println((i + 1) + ")" + event.getEventName() + " - " + event.getEventOrganiser().getName());
        }

        scanner.close();
    }
}
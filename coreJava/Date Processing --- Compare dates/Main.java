import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of Events");
		int n = sc.nextInt();
		sc.nextLine();

		List<Event> events = new ArrayList<>();

		System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");

		for (int i = 0; i < n; i++) {

			try {
				String[] details = sc.nextLine().split(",");

				String name = details[0];
				Date startDate = dateFormat.parse(details[1]);
				Date endDate = dateFormat.parse(details[2]);

				Event e = new Event(name, startDate, endDate);
				events.add(e);

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		System.out.println("1-day Events:");
		boolean found = false;

		for (Event event : events) {
			if (event.oneDayEvent()) {
				found = true;
				System.out.println(event.getEventName());
			}

		}
		if (!found) {
			System.out.println("No Events");
		}

	}

}

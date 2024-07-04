import java.io.*;
import java.util.*;

public class EventBO {
	
	public List<Event> readFromFile(BufferedReader br)  throws Exception{
		
		List<Event> list = new ArrayList<>();	
		String line;
		
		while((line = br.readLine()) != null) {
			
			String[] details = line.split(",");
			int attendeesCount  = Integer.parseInt(details[1]);
			
			if(details.length == 3) {
				
				Event event = new Event(details[0], attendeesCount, details[2]);
				list.add(event);
				
			}

		}
		return list;
	}
	
	public void writeFile(List<Event> eventList, FileWriter fw) throws IOException {
        Set<String> ownerSet = new HashSet<>();
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            for (Event event : eventList) {
                if (ownerSet.add(event.getOwnerName())) {
                    bw.write(event.getEventName() + "," + event.getAttendeesCount() + "," + event.getOwnerName());
                    bw.newLine();
                }
            }
        }
    }
}

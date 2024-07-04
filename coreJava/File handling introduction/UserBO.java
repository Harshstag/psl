import java.io.*;
import java.util.*;

public class UserBO {
	public List<User> readFromFile(BufferedReader br) throws IOException {
		
		List<User> userList = new ArrayList<>();
		
		String line;
		
		while((line = br.readLine()) != null) {
			
			String[] details = line.split(",");
			
			if(details.length == 4) {
				
				User user  = new User(details[0],details[1],details[2],details[3]);
				userList.add(user);
				
			}
		}
			return userList;
			
		}
	
		public void display(List<User> userList) {
			if(userList.isEmpty()) {
				System.out.println("The list is empty");
			}else {
				System.out.printf("%-15s %-20s %-15s %s\n", "Name", "Email", "Username", "Password");
				for(User user : userList) {
					System.out.printf("%-15s %-20s %-15s %s\n",
	                        user.getName(), user.getEmail(), user.getUsername(), user.getPassword());
				}
			}
		}
		

}
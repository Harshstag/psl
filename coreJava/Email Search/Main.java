import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean flag = true;
		
		ArrayList<String> emailList = new ArrayList<>();
		
		while(flag == true) {
			
			System.out.println("Enter Email address");
			
			String emai = sc.nextLine();
			emailList.add(emai);
			
			System.out.println("Do you want to Continue?(yes/no)");
			String yesNo = sc.nextLine();
			
			if(yesNo.equalsIgnoreCase("no")) {
				flag = false;
			}
		}
		
		System.out.println("Enter the email addresses to be searched separated by comma");
		String[] searchEmails = sc.nextLine().split(",");
		
		boolean found = true;
		for(String email : searchEmails) {
			if(!(emailList.contains(email))) {
				System.out.println("Email addresses are not present");
				 found = false;
			}
		}
		if(found == true) {
			System.out.println("Email addresses are present");
		}
		
	}

}

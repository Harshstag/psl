import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<User> userList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter the details of user :"+ (i+1));
			String[] details = sc.nextLine().split(",");
			
			User U = new User(details[0],details[1],details[2],details[3]);
			userList.add(U);
		}
		UserBO BO = new UserBO();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))){
			BO.writeFile(userList, bw );
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}

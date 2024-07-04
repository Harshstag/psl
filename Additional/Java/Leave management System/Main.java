import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String isContinue = null;
		
		List<Leave> leaveList = new ArrayList<Leave>();

		do {

			System.out.println("Enter employee details:");
			String details = br.readLine();
			
			String[] token=details.split(",");
			String type = token[4];

			if (type.equalsIgnoreCase("S")) {
				
				SickLeave sickLeave = new SickLeave(Integer.parseInt(token[0]),token[1],Integer.parseInt(token[2]),token[3]);
				leaveList.add(sickLeave);

			}
			else if (type.equalsIgnoreCase("C")) {

				CasualLeave casualLeave = new CasualLeave(Integer.parseInt(token[0]), token[1],
						Integer.parseInt(token[2]), token[3]);
				leaveList.add(casualLeave);

			}
			
			System.out.println("Do you want to add another?(Yes/No)");
			isContinue = br.readLine();
			
		} while (isContinue.equalsIgnoreCase("yes"));
		
		
		for(Leave l:leaveList)
		{
		  l.calculateLeave();
		}

	}

}


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class main{

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter the stage event start date and end date");
        
        try {
        	DateB0 Bo  = new DateB0();
			String startDateInput = scanner.nextLine();
			
	        Date startDate = Bo.parseDate(startDateInput);
	  
	        
	        String endDateInput = scanner.nextLine();
	        Date endDate = Bo.parseDate(endDateInput);
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
            System.out.println("Start date:" + sdf.format(startDate));
            System.out.println("End date:" + sdf.format(endDate));
	        

		} catch (InvalidDateException  e) {
			System.out.println(e.getMessage());
		}
        

	}

}

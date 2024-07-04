import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String []args){
		
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
			String inpuDate = sc.nextLine();

			SimpleDateFormat inputDateFormate = new SimpleDateFormat("MM-dd-yyyy");
			Date date = inputDateFormate.parse(inpuDate);

			SimpleDateFormat format1 = new SimpleDateFormat("EEE, MMM d, yy");
			SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.yyyy");
			SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yyyy");

			String format1Date = format1.format(date);
			String format2Date = format2.format(date);
			String format3Date = format3.format(date);

			System.out.println("Date Format with EEE, MMM d, yy : " + format1Date);
			System.out.println("Date Format with dd.MM.yyyy : " + format2Date);
			System.out.println("Date Format with dd dd/MM/yyyy : " + format3Date);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
}

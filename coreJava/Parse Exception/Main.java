
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the stage event start date and end date");

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
			String start = sc.nextLine();

			Date startDate = sdf.parse(start);

			String end = sc.nextLine();
			Date endDate = sdf.parse(end);

			System.out.println("Start date:" + sdf.format(startDate));
			System.out.println("End date:" + sdf.format(endDate));

		} catch (ParseException e) {
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		}
		// try {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the stage event start date and end date");

		// LocalDate startDate = LocalDate.parse(sc.nextLine());
		// DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss"));

		// LocalDate endDate = LocalDate.parse(sc.nextLine(),
		// DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss"));

		// System.out.println("Start date:" + startDate);
		// System.out.println("End date:" + endDate);
		// } catch (Exception e) {

		// System.out.println("Input dates should be in the format
		// 'dd-MM-yyyy-HH:mm:ss'");
		// }

	}

}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class DateB0 {
	public static Date parseDate(String dateStr)throws InvalidDateException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new InvalidDateException("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }
	}

}

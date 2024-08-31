
import java.util.DuplicateFormatFlagsException;

public class ContactDetailBO {

    public static void validate(String mobile, String AlternateMobile) throws DuplicateFormatFlagsException {

        if (mobile.equals(AlternateMobile)) {
            throw new DuplicateFormatFlagsException("Mobile number and alternate mobile number are same");

        }
    }
}

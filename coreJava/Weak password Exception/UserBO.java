import java.util.regex.Pattern;

public class UserBO {
	static void validate(User u) throws WeakPasswordException {
		String password = u.getPassword();
		if (password.length() < 10 && password.length() > 20) {
			throw new WeakPasswordException("WeakPasswordException: Your password is weak");
		} else if (!Pattern.compile("[0-9]").matcher(password).find() ||
				!Pattern.compile("[a-zA-Z]").matcher(password).find() ||
				!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find() ||
				!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) {

			throw new WeakPasswordException("WeakPasswordException: Your password is weak");
		}

	}
}

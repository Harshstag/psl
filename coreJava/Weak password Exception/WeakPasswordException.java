
public class WeakPasswordException extends Exception{
		public WeakPasswordException(String message) {
			super(message);
		}
		 @Override
    public String toString() {
        return getMessage();
    }
	
	}

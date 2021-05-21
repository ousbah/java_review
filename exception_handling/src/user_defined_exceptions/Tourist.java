package user_defined_exceptions;

public class Tourist {
	// The errors thrown by the takeTour() method are handled in the main method
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Tourist person = new Tourist();
			try {
				person.takeTour();
				System.out.printf("Tourist %d say: This is cool%n", i + 1);
			} catch (TooHotException e) {
				System.out.printf("Tourist %d say: %s%n", i + 1, e.getMessage());
				continue;
			} catch (TooColdException e) {
				System.out.printf("Tourist %d say: %s%n", i + 1, e.getMessage());
				continue;
			} finally {
				System.out.println();
			}
		}
	}
	
	// throws means that if the mentionned errors occur at runtime, then they  
	// will be thrown to the caller of the method, asking the caller to take 
	// care of it, if it wants to do so
	void takeTour() throws TooHotException, TooColdException {
		int temperature = (int) (Math.random() * 100);
		System.out.println("temperature = " + temperature);
		if (temperature > 60) {
			// throw creates or obtains an exception object and allows the  
			// exception to be passed to its caller
			throw new TooHotException("Too hot here");
		} else if (temperature < 10) {
			// throw allows the exception to be passed to its caller
			throw new TooColdException("Too cold here");
		}
	}
}

class TooColdException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public TooColdException(String message) {
		super(message);
	}
}

class TooHotException extends Exception {

	private static final long serialVersionUID = 1L;

	public TooHotException(String message) {
		super(message);
	}
}

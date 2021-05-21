package analyzing_stack_trace;

// Generates Fibonacci numbers, and studies how many times and when 
// the recursive method used is called
public class FibonacciGenerator {

	public static void main(String[] args) {
		generate(3);
	}

	public static int generate(int n) {
		// To get a stack trace, a Throwable object is constructed
		// and its getStackTrace() method called
		Throwable t = new Throwable();
		StackTraceElement[] frames = t.getStackTrace();
		for (StackTraceElement frame : frames) {
			System.out.println("Calling: " + frame.getMethodName());
		}
		if (n <= 2) {
			return 1;
		} else {
			// the generate() function calls itself twice recursively
			return generate(n - 1) + generate(n - 2);
		}
	}
}

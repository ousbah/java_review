package non_fatal_error_slightly_handled;

import java.util.Random;

public class VisitorRoster {
	
	private final int MAX_CAPACITY = 100;
	private String[] visitors;

	public static void main(String[] args) {
		VisitorRoster roster = new VisitorRoster();
		roster.init();
		roster.registerVisitor();
		try {
			roster.printVisitorList();
		} catch (Exception e) {
			System.out.println("Quitting on end of list...");
		}
	}
	
	private void init() {
		visitors = new String[MAX_CAPACITY];
	}
	
	private void registerVisitor() {
		Random r = new Random();
		System.out.println("Registering visitors");
		System.out.println("--------------------------");
		for (int i = 0; i < MAX_CAPACITY; i++) {
			visitors[i] = Long.toString((Math.abs(r.nextLong())), 36);
		}
	}
	
	private void printVisitorList() {
		System.out.println("Today's Visitors:");
		int i = 0;
		// i<=... instead of i<... to generate ArrayIndexOutOfBoundsException 
		while (i <= MAX_CAPACITY) {
			System.out.println("Visitor ID # " + visitors[i++]);
		}
	}
}

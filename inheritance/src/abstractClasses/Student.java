package abstractClasses;

public class Student extends Person {
	
	public Student(String name, String major) {
		
		// pass name to superclass constructor
		super(name);
		this.major = major;
	}

	private String major;

	public String getDescription() {
		return "a student majoring in " + major;
	}
}

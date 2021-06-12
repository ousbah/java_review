package abstractClasses;

public class PersonTest {

	public static void main(String[] args) {
		
		// create an array of Person and assign it to a reference 
		// of type array of Person
		Person[] people = new Person[2];
		
		// fill the array of Person references with Student and 
		// Employee objects
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computor science");
		
		// Print out names and description of all Person objects
		// The variable p never refers to a Person object because it's impossible to construct
		// of abstract Person class. The variable p always refers to an object to a concrete 
		// subclass
		for (Person p : people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}
}

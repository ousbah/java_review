package inheritance;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager boss = new Manager("Carl Cracker", 80000, 80000, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		// fill the staff array with Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		// prints out information about all Employee objects
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
		
		// to convert from Employee to Manager whenever possible, a cast is needed:
		// staff[0] holds a Manager, so the cast is possible before the assignement
		boss = (Manager) staff[0];
		System.out.println("Cast needed to convert from Employee to Manager: name=" 
							+ boss.getName() + ", salary=" + boss.getSalary());
		
		// not allowed conversion: (java.lang.ClassCastExeption) assigning a superclass
		// reference to a subclass variable is impossible, so is the cast since staff[1]
		// holds an employee (an attempt to cast down the inheritance chain)
//		boss = (Manager) staff[1];
//		System.out.println("name=" + boss.getName() + ", salary=" + boss.getSalary());
		
		// It's good programming practice to find out whether a cast will succeed before
		// attempting it
		if (staff[1] instanceof Manager) {
			boss = (Manager) staff[1];
		} else {
			System.out.println("------------------");
			System.out.println("An attempt to cast down the inheritance chain - "
								+ "cast not allowed");
		}
	}
}

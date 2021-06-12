package equals;

public class Manager extends Employee {
	
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		// when you define equals for a subclass, 1st call equals on the superclass.
		// if that test doesn't pass, then the objects can't be equal
		if (!super.equals(otherObject))
			return false;
		Manager other = (Manager) otherObject;
		// super.equals checked that this and other belong to the same class
		return bonus == other.bonus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

}

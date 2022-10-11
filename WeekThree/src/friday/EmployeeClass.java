package friday;

public class EmployeeClass {

	double salary;
	double hours;

	EmployeeClass() {
		super();
	}

	public void getInfo(double salary, double hours) {
		System.out.println(this.addSalary(salary) + this.addWork(hours));
	}

	public double addSalary(double salary) {
		this.salary = salary;
		if (salary < 500) {
			return salary += 10;
		}
		return salary;
	}

	public double addWork(double hoursPerDay) {
		if (hoursPerDay > 6) {
			System.out.println("at this point -- " + salary);
			return hours += 5;
		}
		return hours;
	}

	@Override
	public String toString() {
		return "EmployeeClass [salary=" + salary + ", hours=" + hours + "]";
	}

	public static void main(String[] args) {

		EmployeeClass lukeSkyWalker = new EmployeeClass();

		lukeSkyWalker.getInfo(100, 8);

	}

}

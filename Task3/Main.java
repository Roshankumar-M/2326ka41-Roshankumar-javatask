package codejava;

class Person {
	String name;
	int age;

	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class Employee extends Person {
	double basicSalary;

	Employee(String name, int age, double basicSalary) {
		super(name, age);
		this.basicSalary = basicSalary;
	}

	double calculateSalary() {
		double hra = 0.2 * basicSalary;
		double da = 0.1 * basicSalary;
		return basicSalary + hra + da;
	}

	void displayEmployeeInfo() {
		displayInfo();
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Total Salary: " + calculateSalary());
	}
}

public class Main {
	public static void main(String[] args) {

		Employee emp = new Employee("John Doe", 30, 30000);

		emp.displayEmployeeInfo();
	}
}

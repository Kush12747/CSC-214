//main employee class
class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee: Name = " + name + ", " + "Salary = " + salary;
	}
}

//manager class 
class Manager extends Employee {

	private String department;
	
	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String toString() {
		return "Manager: " + super.toString() + ", Department = " + department;
	}
}

//executive class
class Executive extends Manager {

	public Executive(String name, double salary, String department) {
		super(name, salary, department);
	}
	
	public String toString() {
		return "Executive: " + super.toString();
	}
}
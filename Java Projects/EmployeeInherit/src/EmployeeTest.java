//testing for inheritance from all classes
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("Edgar", 65000);
	    Manager m = new Manager("Mary", 85000, "Engineering");
	    Executive v = new Executive("Veronica", 105000, "Engineering");
	    System.out.println(e);
	    System.out.println("Expected: Employee[name=Edgar,salary=65000.0]\n");
	    System.out.println(m);
	    System.out.println("Expected: Manager[super=Employee[name=Mary,salary=85000.0],department=Engineering]\n");
	    System.out.println(v);
	    System.out.println("Expected: Executive[super=Manager[super=Employee[name=Veronica,salary=105000.0],department=Engineering]]\n");
	}
}
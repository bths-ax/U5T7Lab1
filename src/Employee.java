public class Employee {
	private static int nextId = 100;

	private int id;
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		nextId++;
		this.id = nextId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static int getLastId() {
		return nextId;
	}

	public static int getEmployed() {
		return nextId - 100;
	}

	public static String classInfo() {
		return
			"Most recent ID assigned: " + getLastId() + "\n" +
			"Total employees hired: " + getEmployed();
	}

	public int getId() { return id; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }

	public String employeeInfo() {
		return 
			"Employee's full name: " + firstName + " " + lastName + "\n" +
			"Employee's ID: " + id;
	}
}

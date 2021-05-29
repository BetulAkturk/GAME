package kodlama›o;

public class ›nstructor extends User {
	
	private int id;
	private int userId;
    private String firstName;
    private String lasttName;
    private	String department;
    private String instructorNumber;
    private double salary;
	
	public ›nstructor() {
		super();
	}

	public ›nstructor(int id, int userId, String firstName, String lasttName, String department,
			String instructorNumber, double salary) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.department = department;
		this.instructorNumber = instructorNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

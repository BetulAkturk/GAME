package kodlamaİo;

public class Student extends User {

	private int id;
	private int userId;
	private String firstName;
	private String lasttName;
	private String department;
	private	String course;
	private String studentNumber;
	
	public Student() {
		super();
		
	}

	public Student(int id, int userId, String firstName, String lasttName, String department, String course,
			String studentNumber) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.department = department;
		this.course = course;
		this.studentNumber = studentNumber;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
}

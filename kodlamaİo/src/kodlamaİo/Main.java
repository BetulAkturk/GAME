package kodlamaİo;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		

		İnstructor instructor = new İnstructor();

		student.setLasttName("Aktürk");
		instructor.setFirstName("Yahya");
		student.setCourse("Java");
		instructor.setSalary(5000);
		
		
		
		UserManager userManager=new UserManager();
		userManager.add(instructor, student);
		
		userManager.list(student);
		
		
	}

}

package kodlama�o;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		

		�nstructor instructor = new �nstructor();

		student.setLasttName("Akt�rk");
		instructor.setFirstName("Yahya");
		student.setCourse("Java");
		instructor.setSalary(5000);
		
		
		
		UserManager userManager=new UserManager();
		userManager.add(instructor, student);
		
		userManager.list(student);
		
		
	}

}

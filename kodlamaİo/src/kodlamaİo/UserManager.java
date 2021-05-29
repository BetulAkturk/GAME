package kodlamaİo;

public class UserManager {
	public void add(İnstructor instructor, Student student) {

		System.out.println(instructor.getFirstName()+student.getCourse()+ " : " + "isimli öğretmen Kaydedildi!");
	}

	public void list(Student student ) {
		System.out.println(student.getLasttName() + " : " + "Soyisimli öğrenci kaydedildi");
	}
    public void created(Student student) {
    	System.out.println(student.getCourse() +":" +"Java kurs oluşturuldu");
    }
}   

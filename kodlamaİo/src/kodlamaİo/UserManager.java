package kodlama�o;

public class UserManager {
	public void add(�nstructor instructor, Student student) {

		System.out.println(instructor.getFirstName()+student.getCourse()+ " : " + "isimli ��retmen Kaydedildi!");
	}

	public void list(Student student ) {
		System.out.println(student.getLasttName() + " : " + "Soyisimli ��renci kaydedildi");
	}
    public void created(Student student) {
    	System.out.println(student.getCourse() +":" +"Java kurs olu�turuldu");
    }
}   

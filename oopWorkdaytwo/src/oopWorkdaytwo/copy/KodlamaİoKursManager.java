package oopWorkdaytwo.copy;

public class Kodlama›oKursManager {
	public void add(Kodlama›oKurs kodlama›oKurs) {
		System.out.println("Kurs eklendi :" + kodlama›oKurs.courseName);
	}

	public void list(Kodlama›oKurs kodlama›oKurs) {
		System.out.println("Kurs listelendi :" + kodlama›oKurs.courseName + " " + kodlama›oKurs.description + " "
				+ kodlama›oKurs.id + " " + kodlama›oKurs.teacherName);
	}
}

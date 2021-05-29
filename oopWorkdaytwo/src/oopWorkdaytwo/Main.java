package oopWorkdaytwo;

public class Main {

	public static void main(String[] args) {
		Kodlama›oKurs kodlama›oKurs= new Kodlama›oKurs("Engin", "Java", 5,"‹cretsiz" );
		Kodlama›oKursManager kodlama›oKursManager=new Kodlama›oKursManager();
		kodlama›oKursManager.add(kodlama›oKurs);
		kodlama›oKursManager.list(kodlama›oKurs);
	}

}


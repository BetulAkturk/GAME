package intro;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf ='I';

		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break; 
			default://bunlarýn dýþýnda
			System.out.println("Ýnce sesli harf");
		}
	}

}

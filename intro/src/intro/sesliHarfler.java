package intro;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf ='I';

		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break; 
			default://bunlar�n d���nda
			System.out.println("�nce sesli harf");
		}
	}

}

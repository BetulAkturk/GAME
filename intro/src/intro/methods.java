package intro;

public class methods {

	public static void main(String[] args) {
		say�Bulmaca();//metodu �a��rmak i�in ismini yazmak yeterli
		say�Bulmaca();
		say�Bulmaca();
		say�Bulmaca();
		}
	
	
    public static void say�Bulmaca() {
    	int[] say�lar = new int [] {1,2,5,7,9,0};
		int aranacak =5;
		boolean varM�=false;
		
		for(int say�: say�lar) {
			if(say�==aranacak) {
				varM�=true;
				break;
			}
		}
		String mesaj="";
		 if(varM�) {
			 mesaj=("Say� mevcuttur:"+ aranacak);
			 mesajVer(mesaj);
			 
		 }else {
			 mesajVer("Say� mevcut de�ildir:"+ aranacak);
		 }

    }
    
    public static void mesajVer(String mesaj) {
    	System.out.println(mesaj);
    }
    }


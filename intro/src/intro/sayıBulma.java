package intro;

public class say�Bulma {

	public static void main(String[] args) {
	int[] say�lar = new int [] {1,2,5,7,9,0};
	int aranacak =5;
	boolean varM�=false;
	
	for(int say�: say�lar) {
		if(say�==aranacak) {
			varM�=true;
			break;
		}
	}
	 if(varM�) {
		 System.out.println("Say� mevcuttur");
	 }else {
		 System.out.println("Say� mevcut de�ildir");
	 }

	}

}

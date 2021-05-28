package intro;

public class methods2 {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayý=topla(5,7);
		System.out.println(sayý);
		int toplam=topla2(2,3,4,5,6);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
    
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla(int sayý1, int sayý2){
		return sayý1+sayý2;
	}
	
	public static int topla2(int... sayýlar) {
		int toplam=0;
				for (int sayý:sayýlar) {
					toplam+=sayý;
				}
				return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}

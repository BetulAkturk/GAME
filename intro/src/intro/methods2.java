package intro;

public class methods2 {

	public static void main(String[] args) {
		String mesaj ="Bug�n hava �ok g�zel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int say�=topla(5,7);
		System.out.println(say�);
		int toplam=topla2(2,3,4,5,6);
		System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
    
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	public static int topla(int say�1, int say�2){
		return say�1+say�2;
	}
	
	public static int topla2(int... say�lar) {
		int toplam=0;
				for (int say�:say�lar) {
					toplam+=say�;
				}
				return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}

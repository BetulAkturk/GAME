package intro;

public class arkada�Say�lar {

	public static void main(String[] args) {
		//220-284 kendileri hari� poztf tam bolenler� toplamlar� b�rb�r�ne e�it
        int say�1=222;
        int say�2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1; i<say�1; i++) {
			if(say�1%i==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int i=1; i<say�2; i++) {
			if(say�2 %i==0) {
				toplam2=toplam2+i;
	 }
	}
         if(say�1==toplam2 && say�2 ==toplam1) {
        	 System.out.println("bu iki say� arkada�t�r");
         }else {
        	 System.out.println("bu iki say� arkada� de�ildir");
         }
         }
}

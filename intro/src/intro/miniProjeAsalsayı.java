package intro;

public class miniProjeAsalsay� {

	public static void main(String[] args) {
		//bug uygulamadaki a��klar, hatalar
		int number =-2;
		int remainder = number % 2;//  kalan� verir
    System.out.println(remainder);
    boolean isPrime = true;//say�n�n asal olmad���n� kabul ediyorum
    
    if(number==1){
      System.out.println("Say� asal de�ildir");
       return;// ba�l� oldugu yeri bitirir kesin
    }
    
    if (number<1){
    	System.out.println("Ge�ersiz say�");
    }
    
    for (int i=2; i<number;i++) {
    	if(number% i==0) {
    	isPrime = false;
    } 
     
    	if(isPrime) {
    		System.out.println("Say� asald�r");
    	} else {
    		System.out.println("Say� asal de�ildir");
    	}
    	}
     
    
	}

	}

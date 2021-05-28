package intro;

public class miniProjeAsalsayý {

	public static void main(String[] args) {
		//bug uygulamadaki açýklar, hatalar
		int number =-2;
		int remainder = number % 2;//  kalaný verir
    System.out.println(remainder);
    boolean isPrime = true;//sayýnýn asal olmadýðýný kabul ediyorum
    
    if(number==1){
      System.out.println("Sayý asal deðildir");
       return;// baðlý oldugu yeri bitirir kesin
    }
    
    if (number<1){
    	System.out.println("Geçersiz sayý");
    }
    
    for (int i=2; i<number;i++) {
    	if(number% i==0) {
    	isPrime = false;
    } 
     
    	if(isPrime) {
    		System.out.println("Sayý asaldýr");
    	} else {
    		System.out.println("Sayý asal deðildir");
    	}
    	}
     
    
	}

	}

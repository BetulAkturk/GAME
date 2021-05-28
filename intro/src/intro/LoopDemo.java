package intro;

public class LoopDemo {

	public static void main(String[] args) {
		//For i++( i yi 1 artýr demek yaný i+1)
		for(int i=1; i<10;i+=2) {
			System.out.println(i);
		}
            System.out.println(" For Döngüsü Bitti");
            //While
            int i=1;
            while (i<10) {
            	System.out.println(i);
            	i++;
            }
            	//infinite loop( sonsuz döngü)
            	System.out.println("While Döngüsü Bitti");
            	//Do While Döngüsü
            	int j=100;
            	do {
            		 System.out.println(j);
                     	j++;
            	} while (j<10);
            	System.out.println("Do-While Döngüsü Bitti");
            }
            
	}


package intro;

public class LoopDemo {

	public static void main(String[] args) {
		//For i++( i yi 1 art�r demek yan� i+1)
		for(int i=1; i<10;i+=2) {
			System.out.println(i);
		}
            System.out.println(" For D�ng�s� Bitti");
            //While
            int i=1;
            while (i<10) {
            	System.out.println(i);
            	i++;
            }
            	//infinite loop( sonsuz d�ng�)
            	System.out.println("While D�ng�s� Bitti");
            	//Do While D�ng�s�
            	int j=100;
            	do {
            		 System.out.println(j);
                     	j++;
            	} while (j<10);
            	System.out.println("Do-While D�ng�s� Bitti");
            }
            
	}


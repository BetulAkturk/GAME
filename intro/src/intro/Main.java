package intro;

public class Main {

	public static void main(String[] args) { 
	
	//camel	
	//Dont repeat yourself	
	      String internetSubeButonu	="�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		//int vade = 36;
		//boolean dustuMu = false;
		
	      System.out.println(internetSubeButonu); 
	      
	         if(dolarBugun<dolarDun) {
	        	 System.out.println("Dolar d��t� resmi"); 
	         }else if(dolarBugun>dolarDun) {
	        	 System.out.println("Dolar y�kseldi resmi"); 
	          }
	          else {
	        	System.out.println("Dolar e�ittir resmi");
	          }
	
	         String kredi1 ="H�zl� Kredi";
	         String kredi2 ="Mutlu emekli kredisi";
	         String kredi3 ="Konut kredisi";
	         String kredi4 ="�ift�i kredisi";
	         String kredi5 ="Meb kredisi";
	         String kredi6 ="K�lt�r bakanl��� kredisi";
	         
	         
	         System.out.println(kredi1);
	         System.out.println(kredi2);
	         System.out.println(kredi3);
	         System.out.println(kredi4);
	         System.out.println(kredi5);
	         System.out.println(kredi6);
	         
	        
	         
	         String[] krediler = 
	        	 {       
	                     "H�zl� Kredi ", 
	        			 "Mutlu emekli kredisi",
	        			 "Konut kredisi",
	        		     "�ift�i kredisi",
	        		     "Msb kredisi",
	        		     "Meb kredisi",
	        		     "K�lt�r bakanl��� kredisi"
	        	 };
    //foreach
	         for(String kredi :krediler) {
	        	 System.out.println(kredi);
	         }
	         for(int i = 0; i<krediler.length;i++ ) {
	        	 System.out.println(krediler [i]);
	         }
	         int say�1 =10;
	         int say�2 =20;
	         say�1 = say�2;
	         say�2 = 100;
	         System.out.println(say�1);
	         
	         int[] say�lar1 = {1,2,3,4,5};
	         int[] say�lar2 = {10,20,30,40,50};
	         say�lar1 = say�lar2;
	         say�lar2[0] = 100;
	         System.out.println(say�lar1[0]);
	         
	         String sehir1 = "Ankara";
	         String sehir2 ="�stanbul";
	         sehir1 = sehir2;
	         sehir2 ="izmir";
	         System.out.println(sehir1);
	}
	} 
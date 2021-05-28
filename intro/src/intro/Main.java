package intro;

public class Main {

	public static void main(String[] args) { 
	
	//camel	
	//Dont repeat yourself	
	      String internetSubeButonu	="Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		//int vade = 36;
		//boolean dustuMu = false;
		
	      System.out.println(internetSubeButonu); 
	      
	         if(dolarBugun<dolarDun) {
	        	 System.out.println("Dolar düþtü resmi"); 
	         }else if(dolarBugun>dolarDun) {
	        	 System.out.println("Dolar yükseldi resmi"); 
	          }
	          else {
	        	System.out.println("Dolar eþittir resmi");
	          }
	
	         String kredi1 ="Hýzlý Kredi";
	         String kredi2 ="Mutlu emekli kredisi";
	         String kredi3 ="Konut kredisi";
	         String kredi4 ="Çiftçi kredisi";
	         String kredi5 ="Meb kredisi";
	         String kredi6 ="Kültür bakanlýðý kredisi";
	         
	         
	         System.out.println(kredi1);
	         System.out.println(kredi2);
	         System.out.println(kredi3);
	         System.out.println(kredi4);
	         System.out.println(kredi5);
	         System.out.println(kredi6);
	         
	        
	         
	         String[] krediler = 
	        	 {       
	                     "Hýzlý Kredi ", 
	        			 "Mutlu emekli kredisi",
	        			 "Konut kredisi",
	        		     "Çiftçi kredisi",
	        		     "Msb kredisi",
	        		     "Meb kredisi",
	        		     "Kültür bakanlýðý kredisi"
	        	 };
    //foreach
	         for(String kredi :krediler) {
	        	 System.out.println(kredi);
	         }
	         for(int i = 0; i<krediler.length;i++ ) {
	        	 System.out.println(krediler [i]);
	         }
	         int sayý1 =10;
	         int sayý2 =20;
	         sayý1 = sayý2;
	         sayý2 = 100;
	         System.out.println(sayý1);
	         
	         int[] sayýlar1 = {1,2,3,4,5};
	         int[] sayýlar2 = {10,20,30,40,50};
	         sayýlar1 = sayýlar2;
	         sayýlar2[0] = 100;
	         System.out.println(sayýlar1[0]);
	         
	         String sehir1 = "Ankara";
	         String sehir2 ="Ýstanbul";
	         sehir1 = sehir2;
	         sehir2 ="izmir";
	         System.out.println(sehir1);
	}
	} 
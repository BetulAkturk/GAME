package intro;

public class arraysDemo {

	public static void main(String[] args) {
		String öðrenci1="Engin";
		String öðrenci2="Derin";
		String öðrenci3="Salih";
		String öðrenci4="Ahmet";
		
		System.out.println(öðrenci1);
		System.out.println(öðrenci2);
		System.out.println(öðrenci3);
		System.out.println(öðrenci4);
		
		System.out.println("........................");
		 
		String[] öðrenciler = new String[4];
		öðrenciler[0]= "Engin";
		öðrenciler[1]= "Derin";
		öðrenciler[2]= "Salih";
		öðrenciler[3]= "Ahmet";
		 
		for(int i=0; i<öðrenciler.length;i++) {
			System.out.println(öðrenciler[i]);
		}
		
		System.out.println("........................");
		
		for (String öðrenci:öðrenciler) {
			System.out.println(öðrenci);
		}
		
				

	}

}

package intro;

public class arraysDemo {

	public static void main(String[] args) {
		String ��renci1="Engin";
		String ��renci2="Derin";
		String ��renci3="Salih";
		String ��renci4="Ahmet";
		
		System.out.println(��renci1);
		System.out.println(��renci2);
		System.out.println(��renci3);
		System.out.println(��renci4);
		
		System.out.println("........................");
		 
		String[] ��renciler = new String[4];
		��renciler[0]= "Engin";
		��renciler[1]= "Derin";
		��renciler[2]= "Salih";
		��renciler[3]= "Ahmet";
		 
		for(int i=0; i<��renciler.length;i++) {
			System.out.println(��renciler[i]);
		}
		
		System.out.println("........................");
		
		for (String ��renci:��renciler) {
			System.out.println(��renci);
		}
		
				

	}

}

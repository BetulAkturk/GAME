package intro;

public class classes {

	public static void main(String[] args) {
		//operasyon main s�n�f�

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		int say�1=10;
		int say�2=20;    
		say�2=say�1;
		say�1=30;
		System.out.println(say�2);
		
		int[] say�lar1 = new int [] {1,2,3};
		int[] say�lar2= new int [] {4,5,6};
		say�lar2=say�lar1;
		say�lar1[0]=10;
		System.out.println(say�lar2[0]);
		
	} 

}
 

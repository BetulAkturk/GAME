package ooplntro;

public class Main {
	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenova V14", 15000, "16 GB Ram", 10, 1324);//referans olu�turma, intance
	
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);//discount:indirim oran�
		product2.setUnitPrice(1600);//unitafterdiscound:indirim sonras� fiyat
		product2.getUnitPriceAfterDiscount();
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("��ecek");
		
		Category category2 = new Category();	
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		//addToCart sepete ekle demek parantez i�i neyi ekleyeceg�n� g�sterir
		
		
		
	}
}
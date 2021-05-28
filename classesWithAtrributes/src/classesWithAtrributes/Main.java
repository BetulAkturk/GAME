package classesWithAtrributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.set_name("Laptop");
		product.set_id(1);
		product.set_price(123);
		product.set_stockAmount(2);
		product.set_description("Güzel");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getkod());

	}

}

package classesWithAtrributes;

public class Product {
	// attribute ve field= deðiþkenler
	// PUBLÝC(HALKA AÇIK) HER YERDEN ULAÞILABILIR
	// PRÝVATE(ÖZEL)
	
	public Product() {
		System.out.println("Yapýcý blok çalýþtý");
		
	}
	
	private int _id;
	private String _name;// saga týkla refaktör+encapsulate gettr setter kýsa yol
	private String _description; // "_" this ile ayný iþlevi görür
	private double _price;
	private int _stockAmount;
	private String _renk;
	

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String getkod() {
		return this._name.substring(0, 1) + _id;
	}

}

package game;

public class Game {
	private int id;
	private String name;
	private String types;
	private int ageRate;
    private	double unitPrice;

	public Game(double unitPrice) {
		super();
		this.unitPrice = unitPrice;
	}

	public Game() {
		super();
	}

	public Game(int id, String name, String types, int ageRate, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.types = types;
		this.ageRate = ageRate;
		this.unitPrice= unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getAgeRate() {
		return ageRate;
	}

	public void setAgeRate(int ageRate) {
		this.ageRate = ageRate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}

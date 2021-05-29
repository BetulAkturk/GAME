package ooplntro;

public class Product {
	//encapsulation
	private int id;          //private:�zel alan 
	private String name;     //final:d��ardan eri�imi k�s�tlar.sadece constructr da set edilebilir
	private double unitPrice;
	private String detail;
	private double  discount;
	
	 
	public Product() {
		
	}
	
	public Product(int id, String name, double unitPrice, String detail,double discount,double unitPriceAfterDiscount) {
		super();               //Construcktrs 
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	    this.discount=discount;
	   
	}

	
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() { //get:okumak
		return name;          
	}
	public void setName(String name) {  // set: yazmak name alan� g�nder
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
	
	
} 
	
	// burdaki id vb alttak�lere 'this' ile e�itlemek gerek(m��terinn g�rd���)
	
	
	//dont repeat yourself(kendini tekrar etme �rn;sepete ekle)
	//her clas sadece bir i�i yapar.
	//classlar ikiye ayr�l�r;1)�zellik tutucu, 2)Metod tutucu i� yapan
	


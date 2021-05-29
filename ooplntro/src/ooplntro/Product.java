package ooplntro;

public class Product {
	//encapsulation
	private int id;          //private:özel alan 
	private String name;     //final:dýþardan eriþimi kýsýtlar.sadece constructr da set edilebilir
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
	public void setName(String name) {  // set: yazmak name alaný gönder
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
	
	// burdaki id vb alttakýlere 'this' ile eþitlemek gerek(müþterinn gördüðü)
	
	
	//dont repeat yourself(kendini tekrar etme örn;sepete ekle)
	//her clas sadece bir iþi yapar.
	//classlar ikiye ayrýlýr;1)Özellik tutucu, 2)Metod tutucu iþ yapan
	


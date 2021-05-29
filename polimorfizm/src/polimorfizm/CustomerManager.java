package polimorfizm;
  
public class CustomerManager {
	private BaseLogger logger;
	   
	public CustomerManager(BaseLogger logger) {   //constrakt�r alan�(new lerken �al���r)
		   this.logger= logger;
	 }
	 public void add() {
	   System.out.println("M��teri Eklendi");
	    this.logger.log("Log mesaj�");
   }
}

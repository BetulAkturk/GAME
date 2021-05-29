package polimorfizm;
  
public class CustomerManager {
	private BaseLogger logger;
	   
	public CustomerManager(BaseLogger logger) {   //constraktýr alaný(new lerken çalýþýr)
		   this.logger= logger;
	 }
	 public void add() {
	   System.out.println("Müþteri Eklendi");
	    this.logger.log("Log mesajý");
   }
}

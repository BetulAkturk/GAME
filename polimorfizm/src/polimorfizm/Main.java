package polimorfizm;

public class Main {

	public static void main(String[] args) {
	//	BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger()};
				// for (BaseLogger logger:loggers) {
		//logger.Log("Log mesaj�");
    // }	
         
	CustomerManager customerManager =new CustomerManager(new FileLogger());
          customerManager.add();
	}
}
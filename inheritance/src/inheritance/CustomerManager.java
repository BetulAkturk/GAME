package inheritance;
//operasyon s�n�f�(m��teriyi y�netecek class)
public class CustomerManager {
        public void add(Customer customer){        //g�vde
        	System.out.println(customer.customerNumber+"kaydedildi");
  }
        //bulk insert
        public void addMultiple(Customer[] customers) {
        	for(Customer customer : customers) {
        		add(customer);
        	}
}
}
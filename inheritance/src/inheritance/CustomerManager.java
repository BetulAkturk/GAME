package inheritance;
//operasyon sýnýfý(müþteriyi yönetecek class)
public class CustomerManager {
        public void add(Customer customer){        //gövde
        	System.out.println(customer.customerNumber+"kaydedildi");
  }
        //bulk insert
        public void addMultiple(Customer[] customers) {
        	for(Customer customer : customers) {
        		add(customer);
        	}
}
}
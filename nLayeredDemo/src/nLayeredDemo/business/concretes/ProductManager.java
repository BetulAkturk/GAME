package nLayeredDemo.business.concretes;


import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
   
	private ProductDao productDao;// constracter ile enjekte et
	private LoggerService loggerService;
	    public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
	    this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� yaz�l�r
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
		return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi:"+ product.getName());
	}
       
	@Override
	 public List<Product> getAll(){
		return null;
		// TODO Auto-generated method stub
		
	}

}

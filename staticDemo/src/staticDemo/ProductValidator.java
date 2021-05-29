package staticDemo;
//ürünü güncellerken kurallara uygun olup olamdýgý incelenir

public class ProductValidator {
         public static boolean isValid(Product product) {
        	 if (product.price>0 && !product.name.isEmpty() ) {
        		 return true;
        	 }else {
        		 return false;
        	 }
         }
}
//!: deðilse anlamý verir
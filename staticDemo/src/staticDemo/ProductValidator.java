package staticDemo;
//�r�n� g�ncellerken kurallara uygun olup olamd�g� incelenir

public class ProductValidator {
         public static boolean isValid(Product product) {
        	 if (product.price>0 && !product.name.isEmpty() ) {
        		 return true;
        	 }else {
        		 return false;
        	 }
         }
}
//!: de�ilse anlam� verir
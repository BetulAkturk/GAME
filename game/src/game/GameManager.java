package game;

public class GameManager implements GameService {
       public void delete(Game game) {
    	   System.out.println("Oyun silindi :" + game.getName());
       }
       
       public void add(Game game) {
    		System.out.println("Oyun  eklendi :" + game.getTypes());   
    	   }
       public void update(Game game) {
    	  System.out.println("Oyun güncellendi :" + game.getName() );
}
}
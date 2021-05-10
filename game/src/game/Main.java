package game;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(); // oyuncu �rettik
		Gamer gamer = new Gamer(3,"Ay�e", "Kaya", "Ekim", "ayse@hotmail.com" );//tan�mla
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager(); //oyun �rettik
		Game game = new Game(1, "S�MS","Komedi",16, 100);
		gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);
        
		CampainManager campainManager= new CampainManager(); //kampanya �rettik
		Campain campain=new Campain(2, "Kutsal Sal�", 100, 0.24);
		campainManager.add(campain);
		campainManager.delete(campain);
		campainManager.update(campain);
		
		SalesManager salesManager= new SalesManager(); //M��teriye sat�yoruz
		salesManager.sales(gamer, game);
		salesManager.campaingSales(gamer, game, campain);
		
	
        
	}

}

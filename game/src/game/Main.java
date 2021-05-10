package game;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(); // oyuncu ürettik
		Gamer gamer = new Gamer(3,"Ayşe", "Kaya", "Ekim", "ayse@hotmail.com" );//tanımla
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager(); //oyun ürettik
		Game game = new Game(1, "SİMS","Komedi",16, 100);
		gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);
        
		CampainManager campainManager= new CampainManager(); //kampanya ürettik
		Campain campain=new Campain(2, "Kutsal Salı", 100, 0.24);
		campainManager.add(campain);
		campainManager.delete(campain);
		campainManager.update(campain);
		
		SalesManager salesManager= new SalesManager(); //Müşteriye satıyoruz
		salesManager.sales(gamer, game);
		salesManager.campaingSales(gamer, game, campain);
		
	
        
	}

}

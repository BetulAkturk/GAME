package game;

public class SalesManager implements SalesService {

	@Override
	public void sales(Gamer gamer, Game game) {
		System.out.println(game.getName() + " isimli oyun " + gamer.getFirstName() + " " + gamer.getLastName()
				+ " isimli kullanýcýya " + game.getUnitPrice() + " TL " + " " + "fiyatla satýldý");

	}

	@Override
	public void campaingSales(Gamer gamer, Game game, Campain campain) {
		double discount = game.getUnitPrice()*(1-(campain.getDiscount()/100));
		System.out.println(game.getName() + " isimli oyun " + gamer.getFirstName() + " " + gamer.getLastName()
				+ " isimli kullanýcýya " + campain.getName() + " kampanyasý ile " + discount + " TL "
				+ " fiyatla satýldý");

	}

}
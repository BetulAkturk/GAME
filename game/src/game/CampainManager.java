package game;

public class CampainManager implements CampaingRateService {
     public void delete(Campain campain) {
    	 System.out.println("Kampanya silindi:" + campain.getName());
     }
     public void update(Campain campain) {
    	 System.out.println("Kampanya g�ncellendi:"+ campain.getName());
     }
     public void add(Campain campain) {
    	 System.out.println("Kampanya eklendi:" + campain.getName());
     }
	
}

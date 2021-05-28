package inherıtanceDemo;

public class Main {

	public static void main(String[] args) {
		ÖğretmenKrediManager öğretmenKrediManager=new ÖğretmenKrediManager();
        öğretmenKrediManager.hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(öğretmenKrediManager);
	}

}

package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
        GameCalculator gameCalculator=new WomanGameCalculator();//referans
		gameCalculator.hesapla();//hesapla:metod gameC:Referansýn örnegi
        GameCalculator gameCalculator2=new ManGameCalculator();
		gameCalculator2.hesapla();
	}

}

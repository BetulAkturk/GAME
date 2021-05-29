package oopRentaCar;

public class Main {

	public static void main(String[] args) {
		IhtıyactanSatılık ıhtıyactanSatılık=new IhtıyactanSatılık(9224366, "Audi", "A6", "A6 Sedan 2.0 TDI", 130000);
		IhtıyactanSatılıkManager ıhtıyactanSatılıkManager=new IhtıyactanSatılıkManager();
        ıhtıyactanSatılıkManager.add(ıhtıyactanSatılık);
}
}
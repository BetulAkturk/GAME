package overriding;

public class OğrencıKrediManager extends BaseKrediManager {
	public double hesapla(double tutar ) {
		return tutar * 1.10;
}
}
 //Overridable:hesaplayı aynı ımzayla yazdıgımız için Base'in hesaplasını ezdik
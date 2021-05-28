package intro;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
	    System.out.println(mesaj);
	    
	    
	    System.out.println("Eleman sayýsý :" +mesaj.length());
        System.out.println("5. eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaþasýn!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[10]; // dizi
        mesaj.getChars(0, 10, karakterler, 0); // metod
        System.out.println(karakterler);        
        System.out.println(mesaj.indexOf('a'));// baþtan baþlar
        System.out.println(mesaj.lastIndexOf("a"));//sondan aramaya baþlar
        
        //replace bir þeyi bir þeyle deðiþtirmek
        String yeniMesaj =mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        //  substring    bir metin içerisinden parça almak
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));//2 den 4 e kadar olan kýsým 4 dahil deðil
        
        //sprit belli bir karakter dizisini ayýrmak(kelimeleri ayrý ayrý yazar)
        for (String kelime : mesaj.split(" ")) {
        System.out.println(kelime);
        }
        //toLowerCase mesajý küçük harfe çevirir.
        System.out.println(mesaj.toLowerCase());
        //toUpperCase tam tersi
        System.out.println(mesaj.toUpperCase());
        //trim metindeki baþta ve sondaký bosluklarý sýler
        System.out.println(mesaj.trim());
        
	}


}

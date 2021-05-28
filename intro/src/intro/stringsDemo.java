package intro;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
	    System.out.println(mesaj);
	    
	    
	    System.out.println("Eleman say�s� :" +mesaj.length());
        System.out.println("5. eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.concat("Ya�as�n!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[10]; // dizi
        mesaj.getChars(0, 10, karakterler, 0); // metod
        System.out.println(karakterler);        
        System.out.println(mesaj.indexOf('a'));// ba�tan ba�lar
        System.out.println(mesaj.lastIndexOf("a"));//sondan aramaya ba�lar
        
        //replace bir �eyi bir �eyle de�i�tirmek
        String yeniMesaj =mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        //  substring    bir metin i�erisinden par�a almak
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));//2 den 4 e kadar olan k�s�m 4 dahil de�il
        
        //sprit belli bir karakter dizisini ay�rmak(kelimeleri ayr� ayr� yazar)
        for (String kelime : mesaj.split(" ")) {
        System.out.println(kelime);
        }
        //toLowerCase mesaj� k���k harfe �evirir.
        System.out.println(mesaj.toLowerCase());
        //toUpperCase tam tersi
        System.out.println(mesaj.toUpperCase());
        //trim metindeki ba�ta ve sondak� bosluklar� s�ler
        System.out.println(mesaj.trim());
        
	}


}

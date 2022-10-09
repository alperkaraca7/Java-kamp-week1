package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Ne mutlu türküm diyene";

		System.out.println(mesaj.length());
		System.out.println(mesaj.charAt(7));
		System.out.println(mesaj.concat("yaşasın cumhuriyet"));
		System.out.println(mesaj.startsWith("N"));
		System.out.println(mesaj.endsWith("e"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
	
		System.out.println(karakterler);
		
		// yoğun olrak kulanılır
		System.out.println(mesaj.indexOf("e"));
		System.out.println(mesaj.lastIndexOf("n"));
		
		System.out.println(mesaj.replace(' ','-'));
		
		// yoğun kullanılır istediğimiz yerden keseriz
		System.out.println(mesaj.substring(3,10));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
	
		System.out.println(mesaj.toUpperCase());
	
		// boşukları atma
		System.out.println(mesaj.trim());
	}

}

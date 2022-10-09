package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenciler[] = {"alper","umut","karaca"}; 

		
		System.out.println(ogrenciler[0]);
		for (String ogrenci : ogrenciler) {
			
			System.out.println(ogrenci);
		}
		System.out.println("for each bitti");
		
		for (int i = 0; i < ogrenciler.length; i++) {
			String isim=ogrenciler[i];
			System.out.println(isim);
			
			System.out.println(ogrenciler[i]);
			
		}
		
		
	}

}

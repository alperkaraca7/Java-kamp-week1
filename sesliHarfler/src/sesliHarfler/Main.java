package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf = 'I';
		
		char[] kalinharf = {'A','I','O','U'};
		
		char[] inceharf= {'E','İ','Ü','Ö'}; 

	 for (char c : inceharf) {
		 if (c == harf) {
			System.out.println("ince harf");
		}
		
	}
	 for (char k : kalinharf) {
		 if (k == harf) {
				System.out.println("Kalın harf");
			}
		 
		
	}
		
	}

}

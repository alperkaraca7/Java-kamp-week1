package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int mug = 28 ;
		int bolenler = 0;
		
		for (int i = 1; i < mug; i++) {
			if (mug%i==0) {
				bolenler += i; 
				
			}
			
		}
		if (bolenler==mug) {
			System.out.println("sayi mükemmeldir");
			
		}
		else {
			System.out.println("mükemmel değildir");
		}
		
	}

}

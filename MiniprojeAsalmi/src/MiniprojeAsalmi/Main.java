package MiniprojeAsalmi;

public class Main {
	
	public static void main(String[] args) {
		
		int number = 100 ;
		
		boolean asalmi = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i ==0) {
				asalmi = false;
			
			}
			
		}
		
		if (asalmi) {
			System.out.println("sayi asaldır");
		}
		else {
			System.out.println("sayi asal değildir");
		}

		
	}

}

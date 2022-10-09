package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
		case 'A': 
			System.out.println("basarılı");
			break;
			
		case 'B':
			System.out.println("güzel geçtiniz");
			break;
			
			default:
				System.out.println("geçersiz not");
		}
	}
}

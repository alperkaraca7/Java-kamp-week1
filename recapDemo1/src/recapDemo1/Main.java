package recapDemo1;

public class Main {
	public static void main(String[] args) {
		
		int sayi1 = 90;
		int sayi2 = 100;
		int sayi3 = 40;
		
		int enbuyuksayi = sayi3;
		
		if (enbuyuksayi<sayi2) {
			enbuyuksayi = sayi2;
			
		}
		if (enbuyuksayi<sayi1) {
			enbuyuksayi = sayi1;
			
		}
		System.out.println(" en büyük sayı "+enbuyuksayi);
		
		
		
	}

}

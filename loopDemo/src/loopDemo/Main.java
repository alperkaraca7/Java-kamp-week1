package loopDemo;

import java.time.chrono.JapaneseChronology;

public class Main {
	
	public static void main(String[] args) {
		
		// for döngüsü
		
		
		for (int i =0; i<100;i++) {
			if (i%2==1) {
				System.out.println(i);
				
			}
			
		}
		
		// while döngüsü
		int i=1 ;
		while (i < 10) {
			System.out.println(i);
			i+=2;	
		}
		System.out.println("while bitti");
		
		int j=100; ;
		do {
			System.out.println(j);
			j++;
			
		} while (j<20);
		System.out.println("do while bitti");
		
		
	}

}

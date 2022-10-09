package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList= {1.4,45.5,34.2};
		
		double total = 0;
		double maxnum=myList[0];
		
		for (double d : myList) {
			if (maxnum<d) {
				maxnum = d;
				
				
			}
			
			total = total +d;
			
		}System.out.println("sayilarin toplami :"+total);
		System.out.println("En büyük sayi :"+maxnum);

	}

}

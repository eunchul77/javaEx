package loof;

public class StarTest2 {

	public static void main(String[] args) {

		for(int a = 1; a<=5;a = a+1) {
			for(int b =5; b >= a; b= b-1) {
				System.out.print("*");
				if(a==b) {
					System.out.println();
				}
			}
		}
		
		
	}

}

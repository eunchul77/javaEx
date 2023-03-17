package loof;

public class WhileTest2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(i<100) {
			i = i + 1;
			sum = sum + i;
			
		}
		System.out.println("1~100의 합: " + sum);
	}

}

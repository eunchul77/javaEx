package forEx;

public class Ex04_05 {

	public static void main(String[] args) {
		System.out.println("===============");
		for (int i = 1; i < 5; i++) {

			for(int j=4; j>0; j--) {
				if(i>=j) {
				System.out.print("*");
				}else
					System.out.print(" ");
//				if(j>i) {
//				System.out.print(" ");
//				}else
//					System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("===============");
	}
}

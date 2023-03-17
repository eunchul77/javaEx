package loof;

public class StarTest {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i = i + 1) {
			for (int j = 1; j <= i; j = j + 1) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
		for (int a = 1; a <= 5; a = a + 1) {
			for (int b = 5; b >= a; b = b - 1) {
				System.out.print("*");
				if (a == b) {
					System.out.println();
				}
			}
		}
	}
}


